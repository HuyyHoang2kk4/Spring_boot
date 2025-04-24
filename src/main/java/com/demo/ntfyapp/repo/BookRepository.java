/**
 Repository trong Spring Boot là một lớp hoặc interface dùng để truy cập và quản lý dữ liệu từ cơ sở dữ liệu
 giúp tương tác    với CSDL ( nó có các lệnh sẵn) xử lý các thao tác cơ bản như lưu, tìm kiếm, xóa hoặc cập nhật dữ liệu từ cơ sở dữ liệu.
 Quản lý Entity: Repository làm việc trực tiếp với các lớp entity để ánh xạ với các bảng trong cơ sở dữ liệu.
 */

package com.demo.ntfyapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ntfyapp.model.entity.Book;
import com.demo.ntfyapp.model.entity.Book.ApprovalStatus;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    // Find books by approval status
    List<Book> findByApprovalStatus(ApprovalStatus status);

    // Find books by author
    List<Book> findByAuthorContainingIgnoreCase(String author);

    // Find books by title
    List<Book> findByTitleContainingIgnoreCase(String title);

    // Find books by ISBN
    Book findByIsbn(String isbn);

    // Find books by publisher
    List<Book> findByPublisherContainingIgnoreCase(String publisher);
}
