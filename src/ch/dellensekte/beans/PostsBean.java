package ch.dellensekte.beans;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ch.dellensekte.domain.Post;
import ch.dellensekte.util.BeanHelper;

@ManagedBean
@ApplicationScoped
public class PostsBean {

	public List<Post> getPosts() {
		DBBean db = BeanHelper.getDBBean();
		return db.getPosts();
	}

	public void setPosts() {

	}

}
