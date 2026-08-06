package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wh0 implements Parcelable {
    public static final Parcelable.Creator<wh0> CREATOR = new a();
    public final ArrayList t;
    public final ArrayList u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<wh0> {
        @Override // android.os.Parcelable.Creator
        public final wh0 createFromParcel(Parcel parcel) {
            return new wh0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final wh0[] newArray(int i) {
            return new wh0[i];
        }
    }

    public wh0(Parcel parcel) {
        this.t = parcel.createStringArrayList();
        this.u = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.t);
        parcel.writeTypedList(this.u);
    }
}
