package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wh0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public ArrayList<l.n> A;
    public ArrayList<String> t;
    public ArrayList<String> u;
    public b[] v;
    public int w;
    public String x = null;
    public ArrayList<String> y = new ArrayList<>();
    public ArrayList<wh0> z = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            m mVar = new m();
            mVar.x = null;
            mVar.y = new ArrayList<>();
            mVar.z = new ArrayList<>();
            mVar.t = parcel.createStringArrayList();
            mVar.u = parcel.createStringArrayList();
            mVar.v = (b[]) parcel.createTypedArray(b.CREATOR);
            mVar.w = parcel.readInt();
            mVar.x = parcel.readString();
            mVar.y = parcel.createStringArrayList();
            mVar.z = parcel.createTypedArrayList(wh0.CREATOR);
            mVar.A = parcel.createTypedArrayList(l.n.CREATOR);
            return mVar;
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.t);
        parcel.writeStringList(this.u);
        parcel.writeTypedArray(this.v, i);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeStringList(this.y);
        parcel.writeTypedList(this.z);
        parcel.writeTypedList(this.A);
    }
}
