package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class onc extends p2 {
    public static final Parcelable.Creator<onc> CREATOR = new pnc();
    public final byte[][] A;
    public final int[] B;
    public final byte[][] C;
    public final String t;
    public final byte[] u;
    public final byte[][] v;
    public final byte[][] w;
    public final byte[][] x;
    public final byte[][] y;
    public final int[] z;

    static {
        byte[][] bArr = new byte[0][];
        new onc(BuildConfig.FLAVOR, null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public onc(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.t = str;
        this.u = bArr;
        this.v = bArr2;
        this.w = bArr3;
        this.x = bArr4;
        this.y = bArr5;
        this.z = iArr;
        this.A = bArr6;
        this.B = iArr2;
        this.C = bArr7;
    }

    public static void j(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            a78.g(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set o(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetE = lk9.e(length);
        for (byte[] bArr2 : bArr) {
            a78.g(bArr2);
            hashSetE.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetE;
    }

    public static List v(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new coc(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objE;
        Object objE2;
        int length;
        int length2;
        if (obj instanceof onc) {
            onc oncVar = (onc) obj;
            if (mpc.a(this.t, oncVar.t) && mpc.a(k(), oncVar.k()) && mpc.a(o(this.v), o(oncVar.v)) && mpc.a(o(this.w), o(oncVar.w)) && mpc.a(o(this.x), o(oncVar.x)) && mpc.a(o(this.y), o(oncVar.y))) {
                int[] iArr = this.z;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objE = Collections.EMPTY_SET;
                } else {
                    objE = lk9.e(length2);
                    for (int i : iArr) {
                        objE.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = oncVar.z;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objE2 = Collections.EMPTY_SET;
                } else {
                    objE2 = lk9.e(length);
                    for (int i2 : iArr2) {
                        objE2.add(Integer.valueOf(i2));
                    }
                }
                if (mpc.a(objE, objE2) && mpc.a(v(this.B), v(oncVar.B)) && mpc.a(o(this.C), o(oncVar.C))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set k() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.A;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.u;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return o((byte[][]) arrayList.toArray(new byte[0][]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.t;
        sb.append(str == null ? "null" : w27.a(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.u;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        j(sb, "GAIA=", this.v);
        sb.append(", ");
        j(sb, "PSEUDO=", this.w);
        sb.append(", ");
        j(sb, "ALWAYS=", this.x);
        sb.append(", ");
        j(sb, "OTHER=", this.y);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.z));
        sb.append(", ");
        j(sb, "directs=", this.A);
        sb.append(", genDims=");
        sb.append(Arrays.toString(v(this.B).toArray()));
        sb.append(", ");
        j(sb, "external=", this.C);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 2, this.t);
        ms3.d(parcel, 3, this.u);
        ms3.e(parcel, 4, this.v);
        ms3.e(parcel, 5, this.w);
        ms3.e(parcel, 6, this.x);
        ms3.e(parcel, 7, this.y);
        ms3.g(parcel, 8, this.z);
        ms3.e(parcel, 9, this.A);
        ms3.g(parcel, 10, this.B);
        ms3.e(parcel, 11, this.C);
        ms3.n(parcel, iM);
    }
}
