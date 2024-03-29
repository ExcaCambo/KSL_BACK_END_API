package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.Comment;
import org.khmerslide.entities.User;
import org.khmerslide.utilities.Pagination;

public interface CommentService {
	public ArrayList<Comment> getComment(Pagination pagination);
	public boolean addComment(Comment category);
	public boolean updateComment(Comment category);
	public boolean deleteComment(int cmt_id);
	public ArrayList<Comment> getCommentById(int cmt_id);
}
