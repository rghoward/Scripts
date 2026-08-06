package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c5a implements hsa {
    public final hsa a;
    public final z4a.a b;
    public z4a g;
    public id4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = n6b.b;
    public final pt7 c = new pt7();

    public c5a(hsa hsaVar, z4a.a aVar) {
        this.a = hsaVar;
        this.b = aVar;
    }

    @Override // defpackage.hsa
    public final void a(final long j, final int i, int i2, int i3, hsa.a aVar) {
        int i4;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, aVar);
            return;
        }
        xl7.f("DRM on subtitles is not supported", aVar == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
            try {
                this.g.b(this.f, i4, i2, z4a.b.c, new ry1() { // from class: b5a
                    @Override // defpackage.ry1
                    public final void accept(Object obj) {
                        mc2 mc2Var = (mc2) obj;
                        c5a c5aVar = this.t;
                        c5aVar.h.getClass();
                        k95<ec2> k95Var = mc2Var.a;
                        long j2 = mc2Var.c;
                        hc2 hc2Var = new hc2();
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(k95Var.size());
                        int size = k95Var.size();
                        int i6 = 0;
                        while (i6 < size) {
                            ec2 ec2Var = k95Var.get(i6);
                            i6++;
                            arrayList.add((Bundle) hc2Var.apply(ec2Var));
                        }
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("c", arrayList);
                        bundle.putLong("d", j2);
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeBundle(bundle);
                        byte[] bArrMarshall = parcelObtain.marshall();
                        parcelObtain.recycle();
                        pt7 pt7Var = c5aVar.c;
                        pt7Var.getClass();
                        pt7Var.K(bArrMarshall, bArrMarshall.length);
                        c5aVar.a.e(bArrMarshall.length, pt7Var);
                        long j3 = mc2Var.b;
                        id4 id4Var = c5aVar.h;
                        long j4 = j;
                        if (j3 == -9223372036854775807L) {
                            xl7.r(id4Var.t == Long.MAX_VALUE);
                        } else {
                            long j5 = id4Var.t;
                            j4 = j5 == Long.MAX_VALUE ? j4 + j3 : j3 + j5;
                        }
                        c5aVar.a.a(j4, i | 1, bArrMarshall.length, 0, null);
                    }
                });
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                if (!this.i) {
                    throw runtimeException;
                }
                md6.h("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e2) {
            e = e2;
            i4 = i5;
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.hsa
    public final void b(pt7 pt7Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(pt7Var, i, i2);
            return;
        }
        h(i);
        pt7Var.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.hsa
    public final int c(ef2 ef2Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.c(ef2Var, i, z);
        }
        h(i);
        int i2 = ef2Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.hsa
    public final void g(id4 id4Var) {
        id4Var.o.getClass();
        String str = id4Var.o;
        xl7.g(fv6.h(str) == 3);
        boolean zEquals = id4Var.equals(this.h);
        z4a.a aVar = this.b;
        if (!zEquals) {
            this.h = id4Var;
            this.g = aVar.f(id4Var) ? aVar.g(id4Var) : null;
        }
        z4a z4aVar = this.g;
        hsa hsaVar = this.a;
        if (z4aVar == null) {
            hsaVar.g(id4Var);
            return;
        }
        id4.a aVarA = id4Var.a();
        aVarA.n = fv6.n("application/x-media3-cues");
        aVarA.j = str;
        aVarA.s = Long.MAX_VALUE;
        aVarA.L = aVar.h(id4Var);
        hy1.b(aVarA, hsaVar);
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
