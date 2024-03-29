package com.example.keepgoingreview;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class SimpleBoardReviewView implements Parcelable {
    private int board_id;
    private int category;
    private String title;
    private int comment_cnt;
    private String image;
    private String content;
    private String member_id;
    private String nickname;
    private int view_cnt;
    private int like_cnt;
    private int dislike_cnt;
    private Date write_date;

    public SimpleBoardReviewView() {}

    public SimpleBoardReviewView(int board_id, int category, String title, int comment_cnt, String image, String content, String member_id, String nickname, int view_cnt, int like_cnt, int dislike_cnt, Date write_date) {
        this.board_id = board_id;
        this.category = category;
        this.title = title;
        this.comment_cnt = comment_cnt;
        this.image = image;
        this.content = content;
        this.member_id = member_id;
        this.nickname = nickname;
        this.view_cnt = view_cnt;
        this.like_cnt = like_cnt;
        this.dislike_cnt = dislike_cnt;
        this.write_date = write_date;
    }

    protected SimpleBoardReviewView(Parcel in) {
        board_id = in.readInt();
        category = in.readInt();
        title = in.readString();
        comment_cnt = in.readInt();
        image = in.readString();
        content = in.readString();
        member_id = in.readString();
        nickname = in.readString();
        view_cnt = in.readInt();
        like_cnt = in.readInt();
        dislike_cnt = in.readInt();
    }

    public static final Creator<SimpleBoardReviewView> CREATOR = new Creator<SimpleBoardReviewView>() {
        @Override
        public SimpleBoardReviewView createFromParcel(Parcel in) {
            return new SimpleBoardReviewView(in);
        }

        @Override
        public SimpleBoardReviewView[] newArray(int size) {
            return new SimpleBoardReviewView[size];
        }
    };

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getComment_cnt() {
        return comment_cnt;
    }

    public void setComment_cnt(int comment_cnt) {
        this.comment_cnt = comment_cnt;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getView_cnt() {
        return view_cnt;
    }

    public void setView_cnt(int view_cnt) {
        this.view_cnt = view_cnt;
    }

    public int getLike_cnt() {
        return like_cnt;
    }

    public void setLike_cnt(int like_cnt) {
        this.like_cnt = like_cnt;
    }

    public int getDislike_cnt() {
        return dislike_cnt;
    }

    public void setDislike_cnt(int dislike_cnt) {
        this.dislike_cnt = dislike_cnt;
    }

    public Date getWrite_date() {
        return write_date;
    }

    public void setWrite_date(Date write_date) {
        this.write_date = write_date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(board_id);
        parcel.writeInt(category);
        parcel.writeString(title);
        parcel.writeInt(comment_cnt);
        parcel.writeString(image);
        parcel.writeString(content);
        parcel.writeString(member_id);
        parcel.writeString(nickname);
        parcel.writeInt(view_cnt);
        parcel.writeInt(like_cnt);
        parcel.writeInt(dislike_cnt);
    }
}
