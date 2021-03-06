package com.dachuwang.software.yaohu.recycleviewpager.model;

import android.os.Parcel;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Table;

/**
 * Created by yaohu on 15/8/21.
 * email yaohu@dachuwang.com
 */
@Table(name = "recent_table")
public class RecentReadEntity extends BaseEntity{
    @Column(column = "bookiid")
    private int bookid;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(this.bookid);
    }

    public RecentReadEntity() {
    }

    protected RecentReadEntity(Parcel in) {
        super(in);
        this.bookid = in.readInt();
    }

    public static final Creator<RecentReadEntity> CREATOR = new Creator<RecentReadEntity>() {
        public RecentReadEntity createFromParcel(Parcel source) {
            return new RecentReadEntity(source);
        }

        public RecentReadEntity[] newArray(int size) {
            return new RecentReadEntity[size];
        }
    };
}
