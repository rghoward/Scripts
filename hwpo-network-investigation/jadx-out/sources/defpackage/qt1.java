package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qt1 implements a21.c {
    public final d t;
    public final ArrayList u;
    public static final a v = new a();
    public static final b w = new b();
    public static final Parcelable.Creator<qt1> CREATOR = new c();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements d {
        @Override // qt1.d
        public final boolean a(ArrayList arrayList, long j) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a21.c cVar = (a21.c) obj;
                if (cVar != null && cVar.p(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // qt1.d
        public final int getId() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements d {
        @Override // qt1.d
        public final boolean a(ArrayList arrayList, long j) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a21.c cVar = (a21.c) obj;
                if (cVar != null && !cVar.p(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // qt1.d
        public final int getId() {
            return 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Parcelable.Creator<qt1> {
        @Override // android.os.Parcelable.Creator
        public final qt1 createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(a21.c.class.getClassLoader());
            int i = parcel.readInt();
            d dVar = qt1.w;
            if (i != 2 && i == 1) {
                dVar = qt1.v;
            }
            arrayList.getClass();
            return new qt1(arrayList, dVar);
        }

        @Override // android.os.Parcelable.Creator
        public final qt1[] newArray(int i) {
            return new qt1[i];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
        boolean a(ArrayList arrayList, long j);

        int getId();
    }

    public qt1(ArrayList arrayList, d dVar) {
        this.u = arrayList;
        this.t = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt1)) {
            return false;
        }
        qt1 qt1Var = (qt1) obj;
        return this.u.equals(qt1Var.u) && this.t.getId() == qt1Var.t.getId();
    }

    public final int hashCode() {
        return this.u.hashCode();
    }

    @Override // a21.c
    public final boolean p(long j) {
        return this.t.a(this.u, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.u);
        parcel.writeInt(this.t.getId());
    }
}
