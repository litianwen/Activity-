package com.example.activityone;

import android.os.Parcel;
import android.os.Parcelable;

public class Obj2 implements Parcelable {
	private String name;
	private String age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static Parcelable.Creator<Obj2> CREATOR = new Creator<Obj2>() {

		@Override
		public Obj2[] newArray(int size) {
			return null;
		}

		@Override
		public Obj2 createFromParcel(Parcel source) {
			Obj2 obj2=new Obj2();
			obj2.setAge(source.readString());
			obj2.setName(source.readString());
			return obj2;
		}
	};

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(age);
		dest.writeString(name);
	}

}
