package top.huangsansui.blog.model;

import java.util.Date;

public class ArticleTag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_tag.article_tag_id
     *
     * @mbggenerated
     */
    private Long articleTagId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_tag.article_id
     *
     * @mbggenerated
     */
    private Long articleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_tag.tag_id
     *
     * @mbggenerated
     */
    private Long tagId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_tag.tag_name
     *
     * @mbggenerated
     */
    private String tagName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_tag.is_delete
     *
     * @mbggenerated
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_tag.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_tag.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_tag.article_tag_id
     *
     * @return the value of article_tag.article_tag_id
     *
     * @mbggenerated
     */
    public Long getArticleTagId() {
        return articleTagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_tag.article_tag_id
     *
     * @param articleTagId the value for article_tag.article_tag_id
     *
     * @mbggenerated
     */
    public void setArticleTagId(Long articleTagId) {
        this.articleTagId = articleTagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_tag.article_id
     *
     * @return the value of article_tag.article_id
     *
     * @mbggenerated
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_tag.article_id
     *
     * @param articleId the value for article_tag.article_id
     *
     * @mbggenerated
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_tag.tag_id
     *
     * @return the value of article_tag.tag_id
     *
     * @mbggenerated
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_tag.tag_id
     *
     * @param tagId the value for article_tag.tag_id
     *
     * @mbggenerated
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_tag.tag_name
     *
     * @return the value of article_tag.tag_name
     *
     * @mbggenerated
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_tag.tag_name
     *
     * @param tagName the value for article_tag.tag_name
     *
     * @mbggenerated
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_tag.is_delete
     *
     * @return the value of article_tag.is_delete
     *
     * @mbggenerated
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_tag.is_delete
     *
     * @param isDelete the value for article_tag.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_tag.update_time
     *
     * @return the value of article_tag.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_tag.update_time
     *
     * @param updateTime the value for article_tag.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_tag.create_time
     *
     * @return the value of article_tag.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_tag.create_time
     *
     * @param createTime the value for article_tag.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}