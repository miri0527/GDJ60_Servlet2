package com.iu.home.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductDAO productDAO;
	private ProductService productService;
	private ProductDTO productDTO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
       productDAO = new ProductDAO();
       productService = new ProductService();
       productDTO = new ProductDTO();
       }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // /product/list.do: 리스트 조회 -> WEB-INF/views/product/productList.jsp
    // /product/add.do : 상품등록 -> WEB-INF/views/product/productAdd.jsp
    // /product/update.do: 상품수정->WEB-INF/views/product/productUpdate.jsp
    // /product/delete.do: 상품삭제 
    // /product/detail.do: 상품 하나 조회 -> WEB-INF/views/product/productDetail.jsp
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Product Page");
		
		StringBuffer sb = request.getRequestURL();
		String uri = request.getRequestURI();
		System.out.println("URL2: " + sb);
		System.out.println("URI2:" + uri);
		uri = uri.substring(uri.lastIndexOf("/") + 1);
		
		if(uri.equals("list.do")) {
			try {
				List<ProductDTO> ar= productService.getProductList();
				//Attribute -> 서버 내에서 데이터를 주고받을 때
				//jsp에서 받기
				request.setAttribute("list", ar);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			uri = "productList.jsp";
		}else if(uri.equals("add.do")) {
			uri = "productAdd.jsp";
		}else if(uri.equals("update.do")) {
			uri = "productUpdate.jsp";
		}else if(uri.equals("delete.do")) {
			
		}else if(uri.equals("detail.do")) {
			String param = request.getParameter("productNum");
			Long num = Long.parseLong(param);
			
				ProductDTO productDTO = new ProductDTO();
				productDTO.setProduct_num(num);
			
			try {
				productDTO =productService.getProductDetail(productDTO);
				request.setAttribute("detail", productDTO);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			uri = "productDetail.jsp";
		}else {
			System.out.println("없습니다");
		}
	
		
//		String name = request.getParameter("name");
//		System.out.println("Name: " + name);
//		int price =Integer.parseInt(request.getParameter("price"));
//		System.out.println("Price: " + price);
		
//		 * String name = request.getParameter("name"); String detail =
//		 * request.getParameter("detail"); productDTO.setProduct_detail(detail);
//		 * productDTO.setProduct_name(name);
//		 * 
//		 * 
//		 * try { int result = productService.setAddProduct(productDTO, new
//		 * ArrayList<ProductOptionDTO>()); System.out.println(result == 1); } catch
//		 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
//		 * 
			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/product/" + uri);
			view.forward(request, response);
		 
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
