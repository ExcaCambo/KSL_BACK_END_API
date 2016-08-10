package org.khmerslide.services.implement;

import java.util.ArrayList;

import org.khmerslide.entities.Comment;
import org.khmerslide.repositories.CommentRepository;
import org.khmerslide.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImplement implements CommentService{
	@Autowired
	private CommentRepository  commentRepository;
	@Override
	public ArrayList<Comment> getComment() {
		return commentRepository.getComment();
	}

	@Override
	public boolean addComment(Comment comment) {
		return commentRepository.addComment(comment);
	}

	@Override
	public boolean updateComment(Comment commnet) {
		return commentRepository.updateComment(commnet);
	}

	@Override
	public boolean deleteComment(int cmt_id) {
		return commentRepository.deleteComment(cmt_id);
	}

	@Override
	public ArrayList<Comment> getCommentById(int cmt_id) {
		return commentRepository.getCommentById(cmt_id);
	}

}
