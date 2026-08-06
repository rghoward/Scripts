package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dt7<T> extends vu9<T> implements Parcelable {
    public static final Parcelable.Creator<dt7<Object>> CREATOR = new a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        ha7 ha7Var = ha7.u;
        wu9<T> wu9Var = this.u;
        if (xj5.a(wu9Var, ha7Var)) {
            i2 = 0;
        } else if (xj5.a(wu9Var, d3a.u)) {
            i2 = 1;
        } else {
            if (!xj5.a(wu9Var, jl8.u)) {
                aa0.c("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Parcelable.ClassLoaderCreator<dt7<Object>> {
        public static dt7 a(Parcel parcel, ClassLoader classLoader) {
            wu9 wu9Var;
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                wu9Var = ha7.u;
            } else if (i == 1) {
                wu9Var = d3a.u;
            } else {
                if (i != 2) {
                    aa0.c(pk.d(i, "Unsupported MutableState policy ", " was restored"));
                    return null;
                }
                wu9Var = jl8.u;
            }
            return new dt7(value, wu9Var);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new dt7[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ dt7<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
