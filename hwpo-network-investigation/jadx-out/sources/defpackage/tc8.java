package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tc8 implements Parcelable {
    public final int t;
    public final String u;
    public final List<l89> v;
    public final List<l89> w;
    public static final a Companion = new a();
    public static final Parcelable.Creator<tc8> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Parcelable.Creator<tc8> {
        @Override // android.os.Parcelable.Creator
        public final tc8 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(l89.CREATOR.createFromParcel(parcel));
            }
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList2.add(l89.CREATOR.createFromParcel(parcel));
            }
            return new tc8(i, string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final tc8[] newArray(int i) {
            return new tc8[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tc8(int i, int i2, String str, ArrayList arrayList) {
        i = (i2 & 1) != 0 ? -1 : i;
        str = (i2 & 2) != 0 ? BuildConfig.FLAVOR : str;
        int i3 = i2 & 4;
        hf3 hf3Var = hf3.t;
        this(i, str, (List<l89>) (i3 != 0 ? hf3Var : arrayList), hf3Var);
    }

    public static tc8 a(tc8 tc8Var, String str, List list, int i) {
        int i2 = tc8Var.t;
        if ((i & 2) != 0) {
            str = tc8Var.u;
        }
        if ((i & 4) != 0) {
            list = tc8Var.v;
        }
        List<l89> list2 = tc8Var.w;
        str.getClass();
        list.getClass();
        list2.getClass();
        return new tc8(i2, str, (List<l89>) list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc8)) {
            return false;
        }
        tc8 tc8Var = (tc8) obj;
        return this.t == tc8Var.t && xj5.a(this.u, tc8Var.u) && xj5.a(this.v, tc8Var.v) && xj5.a(this.w, tc8Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + ho2.a(ru3.c(Integer.hashCode(this.t) * 31, 31, this.u), 31, this.v);
    }

    public final String toString() {
        StringBuilder sbA = il.a("ProgramPerformance(id=", ", text=", this.u, ", attachments=", this.t);
        sbA.append(this.v);
        sbA.append(", uploadingAttachments=");
        sbA.append(this.w);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.t);
        parcel.writeString(this.u);
        List<l89> list = this.v;
        parcel.writeInt(list.size());
        Iterator<l89> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<l89> list2 = this.w;
        parcel.writeInt(list2.size());
        Iterator<l89> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public tc8(int i, String str, List<l89> list, List<l89> list2) {
        str.getClass();
        list.getClass();
        this.t = i;
        this.u = str;
        this.v = list;
        this.w = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public tc8() {
        int i = 0;
        this(i, 15, (String) null, (ArrayList) (0 == true ? 1 : 0));
    }
}
