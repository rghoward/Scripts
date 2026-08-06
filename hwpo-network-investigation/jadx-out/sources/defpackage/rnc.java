package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rnc extends p2 implements Comparable<rnc> {
    public static final Parcelable.Creator<rnc> CREATOR = new snc();
    public final int A;
    public final int B;
    public final String t;
    public final long u;
    public final boolean v;
    public final double w;
    public final String x;
    public final byte[] y;
    public final int z;

    public rnc(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.t = str;
        this.u = j;
        this.v = z;
        this.w = d;
        this.x = str2;
        this.y = bArr;
        this.z = i;
        this.A = i2;
        this.B = i3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(rnc rncVar) {
        int i;
        rnc rncVar2 = rncVar;
        int iCompareTo = this.t.compareTo(rncVar2.t);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = rncVar2.z;
        int i3 = this.z;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.u;
            long j2 = rncVar2.u;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = rncVar2.v;
            boolean z2 = this.v;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.w, rncVar2.w);
        }
        if (i3 == 4) {
            String str = rncVar2.x;
            String str2 = this.x;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            sx0.a(d43.a(i3, "Invalid enum value: ", new StringBuilder(String.valueOf(i3).length() + 20)));
            return 0;
        }
        byte[] bArr = rncVar2.y;
        byte[] bArr2 = this.y;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rnc) {
            rnc rncVar = (rnc) obj;
            if (mpc.a(this.t, rncVar.t)) {
                int i = rncVar.z;
                int i2 = this.z;
                if (i2 == i && this.A == rncVar.A && this.B == rncVar.B) {
                    if (i2 == 1) {
                        return this.u == rncVar.u;
                    }
                    if (i2 == 2) {
                        return this.v == rncVar.v;
                    }
                    if (i2 == 3) {
                        return this.w == rncVar.w;
                    }
                    if (i2 == 4) {
                        return mpc.a(this.x, rncVar.x);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.y, rncVar.y);
                    }
                    sx0.a(d43.a(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final void j(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.t;
        sb.append(str);
        sb.append(", ");
        int i = this.z;
        if (i == 1) {
            sb.append(this.u);
        } else if (i == 2) {
            sb.append(this.v);
        } else if (i == 3) {
            sb.append(this.w);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.x;
            a78.g(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.y;
            a78.g(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.A);
        sb.append(", ");
        sb.append(this.B);
        sb.append(")");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        j(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.t;
        boolean z = str == null;
        int iM = ms3.m(parcel, 20293);
        if (!z) {
            ms3.i(parcel, 2, str);
        }
        long j = this.u;
        if (j != 0) {
            ms3.l(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.v) {
            ms3.l(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.w;
        if (d != 0.0d) {
            ms3.l(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.x;
        if (str2 != null) {
            ms3.i(parcel, 6, str2);
        }
        byte[] bArr = this.y;
        if (bArr != null) {
            ms3.d(parcel, 7, bArr);
        }
        int i2 = this.z;
        if (i2 != 0) {
            ms3.l(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.A;
        if (i3 != 0) {
            ms3.l(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.B;
        if (i4 != 0) {
            ms3.l(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        ms3.n(parcel, iM);
    }
}
