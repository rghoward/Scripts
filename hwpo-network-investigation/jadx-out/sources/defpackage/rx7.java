package defpackage;

import android.graphics.Bitmap;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rx7 implements z4a {
    public final pt7 a = new pt7();
    public final pt7 b = new pt7();
    public final a c = new a();
    public Inflater d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final pt7 a = new pt7();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    @Override // defpackage.z4a
    public final void b(byte[] bArr, int i, int i2, z4a.b bVar, ry1<mc2> ry1Var) {
        int[] iArr;
        ec2 ec2VarA;
        int i3;
        int i4;
        int iZ;
        int i5;
        int i6;
        int iC;
        pt7 pt7Var = this.a;
        pt7Var.K(bArr, i + i2);
        pt7Var.M(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        String str = n6b.a;
        if (pt7Var.a() > 0 && pt7Var.j() == 120) {
            pt7 pt7Var2 = this.b;
            if (n6b.G(pt7Var, pt7Var2, inflater)) {
                pt7Var.K(pt7Var2.a, pt7Var2.c);
            }
        }
        a aVar = this.c;
        int i7 = 0;
        aVar.d = 0;
        int[] iArr2 = aVar.b;
        pt7 pt7Var3 = aVar.a;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        pt7Var3.J(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (pt7Var.a() >= 3) {
            int i8 = pt7Var.c;
            int iZ2 = pt7Var.z();
            int iG = pt7Var.G();
            int i9 = pt7Var.b + iG;
            if (i9 > i8) {
                pt7Var.M(i8);
                i3 = i7;
                iArr = iArr2;
                ec2VarA = null;
            } else {
                char c = 128;
                if (iZ2 != 128) {
                    switch (iZ2) {
                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                            if (iG % 5 == 2) {
                                pt7Var.N(2);
                                Arrays.fill(iArr2, i7);
                                int i10 = iG / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iZ3 = pt7Var.z();
                                    char c2 = c;
                                    double dZ = pt7Var.z();
                                    double dZ2 = pt7Var.z() - 128;
                                    int[] iArr3 = iArr2;
                                    double dZ3 = pt7Var.z() - 128;
                                    iArr3[iZ3] = n6b.i((int) ((dZ3 * 1.772d) + dZ), 0, 255) | (pt7Var.z() << 24) | (n6b.i((int) ((1.402d * dZ2) + dZ), 0, 255) << 16) | (n6b.i((int) ((dZ - (0.34414d * dZ3)) - (dZ2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                aVar.c = true;
                            } else {
                                iArr = iArr2;
                            }
                            break;
                        case 21:
                            if (iG >= 4) {
                                pt7Var.N(3);
                                int i12 = iG - 4;
                                if (((128 & pt7Var.z()) != 0 ? 1 : i7) == 0) {
                                    i5 = pt7Var3.b;
                                    i6 = pt7Var3.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        pt7Var.k(pt7Var3.a, i5, iMin);
                                        pt7Var3.M(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iC = pt7Var.C()) >= 4) {
                                    aVar.h = pt7Var.G();
                                    aVar.i = pt7Var.G();
                                    pt7Var3.J(iC - 4);
                                    i12 = iG - 11;
                                    i5 = pt7Var3.b;
                                    i6 = pt7Var3.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        pt7Var.k(pt7Var3.a, i5, iMin2);
                                        pt7Var3.M(i5 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            break;
                        case 22:
                            if (iG >= 19) {
                                aVar.d = pt7Var.G();
                                aVar.e = pt7Var.G();
                                pt7Var.N(11);
                                aVar.f = pt7Var.G();
                                aVar.g = pt7Var.G();
                            }
                            iArr = iArr2;
                            break;
                        default:
                            iArr = iArr2;
                            break;
                    }
                    i3 = 0;
                    ec2VarA = null;
                } else {
                    iArr = iArr2;
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i4 = pt7Var3.c) == 0 || pt7Var3.b != i4 || !aVar.c) {
                        ec2VarA = null;
                    } else {
                        pt7Var3.M(0);
                        int i13 = aVar.h * aVar.i;
                        int[] iArr4 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iZ4 = pt7Var3.z();
                            if (iZ4 != 0) {
                                iZ = i14 + 1;
                                iArr4[i14] = iArr[iZ4];
                            } else {
                                int iZ5 = pt7Var3.z();
                                if (iZ5 != 0) {
                                    iZ = ((iZ5 & 64) == 0 ? iZ5 & 63 : ((iZ5 & 63) << 8) | pt7Var3.z()) + i14;
                                    Arrays.fill(iArr4, i14, iZ, (iZ5 & 128) == 0 ? iArr[0] : iArr[pt7Var3.z()]);
                                }
                            }
                            i14 = iZ;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        ec2.a aVar2 = new ec2.a();
                        aVar2.b = bitmapCreateBitmap;
                        aVar2.a = null;
                        float f = aVar.f;
                        float f2 = aVar.d;
                        aVar2.h = f / f2;
                        aVar2.i = 0;
                        float f3 = aVar.g;
                        float f4 = aVar.e;
                        aVar2.e = f3 / f4;
                        aVar2.f = 0;
                        aVar2.g = 0;
                        aVar2.l = aVar.h / f2;
                        aVar2.m = aVar.i / f4;
                        ec2VarA = aVar2.a();
                    }
                    i3 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    pt7Var3.J(0);
                    aVar.c = false;
                }
                pt7Var.M(i9);
            }
            if (ec2VarA != null) {
                arrayList.add(ec2VarA);
            }
            i7 = i3;
            iArr2 = iArr;
        }
        ry1Var.accept(new mc2(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
