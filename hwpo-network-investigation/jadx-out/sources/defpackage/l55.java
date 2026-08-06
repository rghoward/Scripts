package defpackage;

import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.e;
import androidx.fragment.app.l;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l55 extends e {
    public static final a Companion = new a();
    public boolean J;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final String t;
        public final String u;
        public final String v;
        public final String w;
        public final Integer x;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, String str2, String str3, String str4, Integer num) {
            str4.getClass();
            this.t = str;
            this.u = str2;
            this.v = str3;
            this.w = str4;
            this.x = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return xj5.a(this.t, bVar.t) && xj5.a(this.u, bVar.u) && xj5.a(this.v, bVar.v) && xj5.a(this.w, bVar.w) && xj5.a(this.x, bVar.x);
        }

        public final int hashCode() {
            String str = this.t;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.u;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.v;
            int iC = ru3.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.w);
            Integer num = this.x;
            return iC + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = vb0.a("Params(title=", this.t, ", description=", this.u, ", cancelButtonText=");
            ux1.b(sbA, this.v, ", okButtonText=", this.w, ", okButtonTextColor=");
            sbA.append(this.x);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.t);
            parcel.writeString(this.u);
            parcel.writeString(this.v);
            parcel.writeString(this.w);
            Integer num = this.x;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
        }
    }

    @Override // androidx.fragment.app.e
    public final void i() {
        if (this.J) {
            this.J = false;
            k(false, false);
        }
    }

    @Override // androidx.fragment.app.e
    public final void o(l lVar, String str) {
        lVar.getClass();
        if (this.J) {
            return;
        }
        this.J = true;
        super.o(lVar, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (this.J) {
            this.J = false;
        }
    }

    public final void p() {
        getParentFragmentManager().e0(uy0.c(new js7("arg_dialog_is_confirmed", Boolean.FALSE)), "result_dialog_confirm");
        i();
    }

    public final void q() {
        getParentFragmentManager().e0(uy0.c(new js7("arg_dialog_is_confirmed", Boolean.TRUE)), "result_dialog_confirm");
        i();
    }

    public final void r(l lVar) {
        o(lVar, getClass().getName());
    }
}
