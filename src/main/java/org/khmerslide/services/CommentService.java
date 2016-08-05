package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.Comment;

public interface CommentService {
	public ArrayList<Comment> getComment();
	public boolean addComment(Comment category);
	public boolean updateComment(Comment category);
	public boolean deleteComment(int cmt_id);
}
