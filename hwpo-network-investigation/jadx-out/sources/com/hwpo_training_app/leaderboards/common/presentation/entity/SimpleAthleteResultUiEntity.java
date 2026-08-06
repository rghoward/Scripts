package com.hwpo_training_app.leaderboards.common.presentation.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SimpleAthleteResultUiEntity implements Parcelable {
    public static final Parcelable.Creator<SimpleAthleteResultUiEntity> CREATOR = new Creator();
    public final String t;
    public final CharSequence u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<SimpleAthleteResultUiEntity> {
        @Override // android.os.Parcelable.Creator
        public final SimpleAthleteResultUiEntity createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SimpleAthleteResultUiEntity(parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleAthleteResultUiEntity[] newArray(int i) {
            return new SimpleAthleteResultUiEntity[i];
        }
    }

    public SimpleAthleteResultUiEntity(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        this.t = str;
        this.u = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleAthleteResultUiEntity)) {
            return false;
        }
        SimpleAthleteResultUiEntity simpleAthleteResultUiEntity = (SimpleAthleteResultUiEntity) obj;
        return xj5.a(this.t, simpleAthleteResultUiEntity.t) && xj5.a(this.u, simpleAthleteResultUiEntity.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleAthleteResultUiEntity(indexText=" + this.t + ", resultText=" + ((Object) this.u) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.t);
        TextUtils.writeToParcel(this.u, parcel, i);
    }
}
