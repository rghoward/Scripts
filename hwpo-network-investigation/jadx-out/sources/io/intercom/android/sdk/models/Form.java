package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.ho2;
import defpackage.pi1;
import defpackage.xj5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Form implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Form> CREATOR = new Creator();

    @SerializedName("attributes")
    private final List<Attribute> attributes;

    @SerializedName("disabled")
    private final boolean disabled;

    @SerializedName("type")
    private final String type;

    public Form(String str, List<Attribute> list, boolean z) {
        str.getClass();
        list.getClass();
        this.type = str;
        this.attributes = list;
        this.disabled = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Form copy$default(Form form, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = form.type;
        }
        if ((i & 2) != 0) {
            list = form.attributes;
        }
        if ((i & 4) != 0) {
            z = form.disabled;
        }
        return form.copy(str, list, z);
    }

    public final String component1() {
        return this.type;
    }

    public final List<Attribute> component2() {
        return this.attributes;
    }

    public final boolean component3() {
        return this.disabled;
    }

    public final Form copy(String str, List<Attribute> list, boolean z) {
        str.getClass();
        list.getClass();
        return new Form(str, list, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Form)) {
            return false;
        }
        Form form = (Form) obj;
        return xj5.a(this.type, form.type) && xj5.a(this.attributes, form.attributes) && this.disabled == form.disabled;
    }

    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disabled) + ho2.a(this.type.hashCode() * 31, 31, this.attributes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Form(type=");
        sb.append(this.type);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", disabled=");
        return pi1.a(sb, this.disabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.type);
        List<Attribute> list = this.attributes;
        parcel.writeInt(list.size());
        Iterator<Attribute> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.disabled ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Creator implements Parcelable.Creator<Form> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Attribute.CREATOR.createFromParcel(parcel));
            }
            return new Form(string, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Form[] newArray(int i) {
            return new Form[i];
        }
    }
}
