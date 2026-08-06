package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bh4 implements js3 {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final id4 O;
    public long A;
    public b B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public ls3 H;
    public hsa[] I;
    public hsa[] J;
    public boolean K;
    public boolean L;
    public long M;
    public final z4a.a a;
    public final int b;
    public final List<id4> c;
    public final byte[] h;
    public final pt7 i;
    public final apa j;
    public final pn8 o;
    public final gq0 p;
    public ul8 q;
    public int r;
    public int s;
    public long t;
    public int u;
    public pt7 v;
    public long w;
    public int x;
    public long y;
    public long z;
    public final vm3 k = new vm3();
    public final pt7 l = new pt7(16);
    public final pt7 e = new pt7(f47.a);
    public final pt7 f = new pt7(6);
    public final pt7 g = new pt7();
    public final ArrayDeque<sz6.a> m = new ArrayDeque<>();
    public final ArrayDeque<a> n = new ArrayDeque<>();
    public final SparseArray<b> d = new SparseArray<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(int i, long j, boolean z) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final hsa a;
        public isa d;
        public bt2 e;
        public int f;
        public int g;
        public int h;
        public int i;
        public final id4 j;
        public boolean m;
        public final dsa b = new dsa();
        public final pt7 c = new pt7();
        public final pt7 k = new pt7(1);
        public final pt7 l = new pt7();

        public b(hsa hsaVar, isa isaVar, bt2 bt2Var, id4 id4Var) {
            this.a = hsaVar;
            this.d = isaVar;
            this.e = bt2Var;
            this.j = id4Var;
            this.d = isaVar;
            this.e = bt2Var;
            hsaVar.g(id4Var);
            e();
        }

        public final int a() {
            int i;
            if (this.m) {
                i = this.b.j[this.f] ? 1 : 0;
            } else {
                i = this.d.g[this.f];
            }
            return b() != null ? 1073741824 | i : i;
        }

        public final csa b() {
            if (!this.m) {
                return null;
            }
            dsa dsaVar = this.b;
            bt2 bt2Var = dsaVar.a;
            String str = n6b.a;
            int i = bt2Var.a;
            csa csaVar = dsaVar.m;
            if (csaVar == null) {
                csaVar = this.d.a.l[i];
            }
            if (csaVar == null || !csaVar.a) {
                return null;
            }
            return csaVar;
        }

        public final boolean c() {
            this.f++;
            if (!this.m) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public final int d(int i, int i2) {
            pt7 pt7Var;
            csa csaVarB = b();
            if (csaVarB == null) {
                return 0;
            }
            int length = csaVarB.d;
            dsa dsaVar = this.b;
            if (length != 0) {
                pt7Var = dsaVar.n;
            } else {
                byte[] bArr = csaVarB.e;
                String str = n6b.a;
                int length2 = bArr.length;
                pt7 pt7Var2 = this.l;
                pt7Var2.K(bArr, length2);
                length = bArr.length;
                pt7Var = pt7Var2;
            }
            boolean z = dsaVar.k && dsaVar.l[this.f];
            boolean z2 = z || i2 != 0;
            pt7 pt7Var3 = this.k;
            pt7Var3.a[0] = (byte) ((z2 ? 128 : 0) | length);
            pt7Var3.M(0);
            hsa hsaVar = this.a;
            hsaVar.b(pt7Var3, 1, 1);
            hsaVar.b(pt7Var, length, 1);
            if (!z2) {
                return length + 1;
            }
            pt7 pt7Var4 = this.c;
            if (!z) {
                pt7Var4.J(8);
                byte[] bArr2 = pt7Var4.a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = 0;
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                hsaVar.b(pt7Var4, 8, 1);
                return length + 9;
            }
            pt7 pt7Var5 = dsaVar.n;
            int iG = pt7Var5.G();
            pt7Var5.N(-2);
            int i3 = (iG * 6) + 2;
            if (i2 != 0) {
                pt7Var4.J(i3);
                byte[] bArr3 = pt7Var4.a;
                pt7Var5.k(bArr3, 0, i3);
                int i4 = (((bArr3[2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr3[3] & MessagePack.Code.EXT_TIMESTAMP)) + i2;
                bArr3[2] = (byte) ((i4 >> 8) & 255);
                bArr3[3] = (byte) (i4 & 255);
            } else {
                pt7Var4 = pt7Var5;
            }
            hsaVar.b(pt7Var4, i3, 1);
            return length + 1 + i3;
        }

        public final void e() {
            dsa dsaVar = this.b;
            dsaVar.d = 0;
            dsaVar.p = 0L;
            dsaVar.q = false;
            dsaVar.k = false;
            dsaVar.o = false;
            dsaVar.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.m = false;
        }
    }

    static {
        id4.a aVar = new id4.a();
        aVar.n = fv6.n("application/x-emsg");
        O = new id4(aVar);
    }

    public bh4(z4a.a aVar, int i, apa apaVar, List list) {
        this.a = aVar;
        this.b = i;
        this.j = apaVar;
        this.c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new pt7(bArr);
        k95.b bVar = k95.u;
        this.q = ul8.x;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = ls3.e;
        this.I = new hsa[0];
        this.J = new hsa[0];
        this.o = new pn8(new pn8.b() { // from class: ah4
            @Override // pn8.b
            public final void a(long j, pt7 pt7Var) {
                y51.a(j, pt7Var, this.a.J);
            }
        });
        this.p = new gq0();
        this.M = -1L;
    }

    public static h83 i(List<sz6.b> list) {
        UUID[] uuidArr;
        vf8.a aVar;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            sz6.b bVar = list.get(i2);
            if (bVar.a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.b.a;
                pt7 pt7Var = new pt7(bArr);
                if (pt7Var.c < 32) {
                    aVar = null;
                } else {
                    pt7Var.M(i);
                    int iA = pt7Var.a();
                    int iM = pt7Var.m();
                    if (iM != iA) {
                        md6.g("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
                    } else {
                        int iM2 = pt7Var.m();
                        if (iM2 != 1886614376) {
                            d80.a(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
                        } else {
                            int iE = iv0.e(pt7Var.m());
                            if (iE > 1) {
                                d80.a(iE, "Unsupported pssh version: ", "PsshAtomUtil");
                            } else {
                                UUID uuid = new UUID(pt7Var.t(), pt7Var.t());
                                if (iE == 1) {
                                    int iD = pt7Var.D();
                                    uuidArr = new UUID[iD];
                                    int i3 = i;
                                    while (i3 < iD) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(pt7Var.t(), pt7Var.t());
                                        i3 = i4 + 1;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                int iD2 = pt7Var.D();
                                int iA2 = pt7Var.a();
                                if (iD2 != iA2) {
                                    md6.g("PsshAtomUtil", "Atom data size (" + iD2 + ") does not match the bytes left: " + iA2);
                                } else {
                                    byte[] bArr2 = new byte[iD2];
                                    pt7Var.k(bArr2, 0, iD2);
                                    aVar = new vf8.a(uuid, iE, bArr2, uuidArr);
                                }
                            }
                        }
                    }
                    aVar = null;
                }
                UUID uuid2 = aVar == null ? null : aVar.a;
                if (uuid2 == null) {
                    md6.g("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new h83.b(uuid2, null, "video/mp4", bArr));
                }
            }
            i2++;
            i = 0;
        }
        if (arrayList == null) {
            return null;
        }
        return new h83(null, false, (h83.b[]) arrayList.toArray(new h83.b[0]));
    }

    public static void j(pt7 pt7Var, int i, dsa dsaVar) throws ut7 {
        pt7Var.M(i + 8);
        int iM = pt7Var.m();
        byte[] bArr = iv0.a;
        if ((iM & 1) != 0) {
            throw ut7.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iD = pt7Var.D();
        if (iD == 0) {
            Arrays.fill(dsaVar.l, 0, dsaVar.e, false);
            return;
        }
        int i2 = dsaVar.e;
        pt7 pt7Var2 = dsaVar.n;
        if (iD != i2) {
            StringBuilder sbB = t43.b(iD, "Senc sample count ", " is different from fragment sample count");
            sbB.append(dsaVar.e);
            throw ut7.a(null, sbB.toString());
        }
        Arrays.fill(dsaVar.l, 0, iD, z);
        pt7Var2.J(pt7Var.a());
        dsaVar.k = true;
        dsaVar.o = true;
        pt7Var.k(pt7Var2.a, 0, pt7Var2.c);
        pt7Var2.M(0);
        dsaVar.o = false;
    }

    public static Pair k(long j, pt7 pt7Var) throws ut7 {
        long jF;
        long jF2;
        pt7 pt7Var2 = pt7Var;
        pt7Var2.M(8);
        int iE = iv0.e(pt7Var2.m());
        pt7Var2.N(4);
        long jB = pt7Var2.B();
        if (iE == 0) {
            jF = pt7Var2.B();
            jF2 = pt7Var2.B();
        } else {
            jF = pt7Var2.F();
            jF2 = pt7Var2.F();
        }
        long j2 = jF2 + j;
        String str = n6b.a;
        long jU = n6b.U(jF, 1000000L, jB, RoundingMode.DOWN);
        pt7Var2.N(2);
        int iG = pt7Var2.G();
        int[] iArr = new int[iG];
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        long[] jArr3 = new long[iG];
        long j3 = j2;
        long j4 = jU;
        int i = 0;
        while (i < iG) {
            int iM = pt7Var2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw ut7.a(null, "Unhandled indirect reference");
            }
            long jB2 = pt7Var2.B();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jF += jB2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jU2 = n6b.U(jF, 1000000L, jB, RoundingMode.DOWN);
            jArr4[i] = jU2 - jArr5[i];
            pt7Var2.N(4);
            j3 += (long) iArr[i];
            i++;
            iG = iG;
            pt7Var2 = pt7Var;
            j4 = jU2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jU), new wc1(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:121:0x0247  */
    /* JADX WARN: Code duplicated, block: B:144:0x0292  */
    /* JADX WARN: Code duplicated, block: B:145:0x0294  */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        pn8 pn8Var;
        pt7 pt7Var;
        ArrayDeque<a> arrayDeque;
        int i;
        apa apaVar;
        b bVar;
        boolean z;
        int i2;
        b bVar2;
        int i3;
        int iF;
        int i4;
        boolean z2;
        String strC;
        int i5;
        int i6;
        String strU;
        String strU2;
        long jU;
        long j;
        long jA;
        long j2;
        long jB;
        int i7;
        ks3 ks3Var2 = ks3Var;
        while (true) {
            int i8 = this.r;
            ArrayDeque<sz6.a> arrayDeque2 = this.m;
            pn8Var = this.o;
            pt7Var = this.i;
            gq0 gq0Var = this.p;
            SparseArray<b> sparseArray = this.d;
            boolean z3 = true;
            if (i8 != 0) {
                arrayDeque = this.n;
                i = this.b;
                apaVar = this.j;
                if (i8 != 1) {
                    long j3 = Long.MAX_VALUE;
                    if (i8 != 2) {
                        bVar = this.B;
                        if (bVar != null) {
                            z = true;
                            i2 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        int i9 = 0;
                        b bVar3 = null;
                        while (i9 < size) {
                            b bVarValueAt = sparseArray.valueAt(i9);
                            boolean z4 = z3;
                            boolean z5 = bVarValueAt.m;
                            dsa dsaVar = bVarValueAt.b;
                            if (z5) {
                                i6 = size;
                            } else {
                                i6 = size;
                                if (bVarValueAt.f != bVarValueAt.d.b) {
                                }
                                i9++;
                                z3 = z4;
                                size = i6;
                            }
                            if (!z5 || bVarValueAt.h != dsaVar.d) {
                                long j4 = !z5 ? bVarValueAt.d.c[bVarValueAt.f] : dsaVar.f[bVarValueAt.h];
                                if (j4 < j3) {
                                    bVar3 = bVarValueAt;
                                    j3 = j4;
                                }
                            }
                            i9++;
                            z3 = z4;
                            size = i6;
                        }
                        z = z3;
                        i2 = 8;
                        if (bVar3 != null) {
                            int position = (int) ((!bVar3.m ? bVar3.d.c[bVar3.f] : bVar3.b.f[bVar3.h]) - ks3Var2.getPosition());
                            if (position < 0) {
                                md6.g("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            ks3Var2.m(position);
                            this.B = bVar3;
                            bVar = bVar3;
                            break;
                        }
                        int position2 = (int) (this.w - ks3Var2.getPosition());
                        if (position2 < 0) {
                            throw ut7.a(null, "Offset to end of mdat was negative.");
                        }
                        ks3Var2.m(position2);
                        h();
                    } else {
                        int size2 = sparseArray.size();
                        b bVarValueAt2 = null;
                        for (int i10 = 0; i10 < size2; i10++) {
                            dsa dsaVar2 = sparseArray.valueAt(i10).b;
                            if (dsaVar2.o) {
                                long j5 = dsaVar2.c;
                                if (j5 < j3) {
                                    bVarValueAt2 = sparseArray.valueAt(i10);
                                    j3 = j5;
                                }
                            }
                        }
                        if (bVarValueAt2 == null) {
                            this.r = 3;
                        } else {
                            int position3 = (int) (j3 - ks3Var2.getPosition());
                            if (position3 < 0) {
                                throw ut7.a(null, "Offset to encryption data was negative.");
                            }
                            ks3Var2.m(position3);
                            dsa dsaVar3 = bVarValueAt2.b;
                            pt7 pt7Var2 = dsaVar3.n;
                            ks3Var2.readFully(pt7Var2.a, 0, pt7Var2.c);
                            pt7Var2.M(0);
                            dsaVar3.o = false;
                        }
                    }
                } else {
                    int i11 = (int) (this.t - ((long) this.u));
                    pt7 pt7Var3 = this.v;
                    if (pt7Var3 != null) {
                        ks3Var2.readFully(pt7Var3.a, 8, i11);
                        int i12 = this.s;
                        sz6.b bVar4 = new sz6.b(i12, pt7Var3);
                        if (!arrayDeque2.isEmpty()) {
                            arrayDeque2.peek().c.add(bVar4);
                        } else if (i12 == 1936286840) {
                            Pair pairK = k(ks3Var2.getPosition(), pt7Var3);
                            gq0Var.b((wc1) pairK.second);
                            LinkedHashMap linkedHashMap = (LinkedHashMap) gq0Var.t;
                            this.A = ((Long) pairK.first).longValue();
                            if (this.L) {
                                i7 = 1;
                            } else {
                                i7 = 1;
                                this.H.t(linkedHashMap.size() == 1 ? (t89) pairK.second : gq0Var.c());
                                this.K = true;
                            }
                            if ((i & 256) != 0 && !this.L && linkedHashMap.size() > i7) {
                                this.M = ks3Var2.getPosition();
                            }
                        } else if (i12 == 1701671783 && this.I.length != 0) {
                            pt7Var3.M(8);
                            int iE = iv0.e(pt7Var3.m());
                            if (iE == 0) {
                                strU = pt7Var3.u();
                                strU.getClass();
                                strU2 = pt7Var3.u();
                                strU2.getClass();
                                long jB2 = pt7Var3.B();
                                long jB3 = pt7Var3.B();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jU2 = n6b.U(jB3, 1000000L, jB2, roundingMode);
                                long j6 = this.A;
                                long j7 = j6 != -9223372036854775807L ? j6 + jU2 : -9223372036854775807L;
                                jU = n6b.U(pt7Var3.B(), 1000L, jB2, roundingMode);
                                long j8 = j7;
                                j = jU2;
                                jA = j8;
                                j2 = -9223372036854775807L;
                                jB = pt7Var3.B();
                            } else if (iE != 1) {
                                d80.a(iE, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jB4 = pt7Var3.B();
                                long jF = pt7Var3.F();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jA = n6b.U(jF, 1000000L, jB4, roundingMode2);
                                long jU3 = n6b.U(pt7Var3.B(), 1000L, jB4, roundingMode2);
                                long jB5 = pt7Var3.B();
                                strU = pt7Var3.u();
                                strU.getClass();
                                strU2 = pt7Var3.u();
                                strU2.getClass();
                                j2 = -9223372036854775807L;
                                jB = jB5;
                                jU = jU3;
                                j = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[pt7Var3.a()];
                            pt7Var3.k(bArr, 0, pt7Var3.a());
                            vm3 vm3Var = this.k;
                            DataOutputStream dataOutputStream = vm3Var.b;
                            ByteArrayOutputStream byteArrayOutputStream = vm3Var.a;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strU);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strU2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jU);
                                dataOutputStream.writeLong(jB);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                pt7 pt7Var4 = new pt7(byteArrayOutputStream.toByteArray());
                                int iA = pt7Var4.a();
                                for (hsa hsaVar : this.I) {
                                    pt7Var4.M(0);
                                    hsaVar.e(iA, pt7Var4);
                                }
                                if (jA == j2) {
                                    arrayDeque.addLast(new a(iA, j, true));
                                    this.x += iA;
                                } else if (!arrayDeque.isEmpty()) {
                                    arrayDeque.addLast(new a(iA, jA, false));
                                    this.x += iA;
                                } else if (apaVar == null || apaVar.e()) {
                                    if (apaVar != null) {
                                        jA = apaVar.a(jA);
                                    }
                                    long j9 = jA;
                                    for (hsa hsaVar2 : this.I) {
                                        hsaVar2.a(j9, 1, iA, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new a(iA, jA, false));
                                    this.x += iA;
                                }
                            } catch (IOException e) {
                                d55.a(e);
                                return 0;
                            }
                        }
                        ks3Var2 = ks3Var;
                    } else {
                        ks3Var2.m(i11);
                    }
                    l(ks3Var2.getPosition());
                }
            } else {
                int i13 = this.u;
                pt7 pt7Var5 = this.l;
                if (i13 == 0) {
                    if (!ks3Var2.b(pt7Var5.a, 0, 8, true)) {
                        long j10 = this.M;
                        if (j10 == -1) {
                            pn8Var.b(0);
                            return -1;
                        }
                        o68Var.a = j10;
                        this.M = -1L;
                        this.H.t(gq0Var.c());
                        this.L = true;
                        return 1;
                    }
                    this.u = 8;
                    pt7Var5.M(0);
                    this.t = pt7Var5.B();
                    this.s = pt7Var5.m();
                }
                long j11 = this.t;
                if (j11 == 1) {
                    ks3Var2.readFully(pt7Var5.a, 8, 8);
                    this.u += 8;
                    this.t = pt7Var5.F();
                } else if (j11 == 0) {
                    long jA2 = ks3Var2.a();
                    if (jA2 == -1 && !arrayDeque2.isEmpty()) {
                        jA2 = arrayDeque2.peek().b;
                    }
                    if (jA2 != -1) {
                        this.t = (jA2 - ks3Var2.getPosition()) + ((long) this.u);
                    }
                }
                long j12 = this.t;
                int i14 = this.u;
                long j13 = i14;
                if (j12 < j13) {
                    if (this.s != 1718773093 || i14 != 8) {
                        throw ut7.c("Atom size less than header length (unsupported).");
                    }
                    this.t = j13;
                }
                if (this.M != -1) {
                    int i15 = this.s;
                    long j14 = this.t;
                    if (i15 == 1936286840) {
                        pt7Var.J((int) j14);
                        System.arraycopy(pt7Var5.a, 0, pt7Var.a, 0, 8);
                        ks3Var2.readFully(pt7Var.a, 8, (int) (this.t - ((long) this.u)));
                        gq0Var.b((wc1) k(ks3Var2.g(), pt7Var).second);
                    } else {
                        ks3Var2.e((int) (j14 - j13), true);
                    }
                    h();
                } else {
                    long position4 = ks3Var2.getPosition() - ((long) this.u);
                    int i16 = this.s;
                    if ((i16 == 1836019558 || i16 == 1835295092) && !this.K) {
                        this.H.t(new t89.b(this.z, position4));
                        this.K = true;
                    }
                    if (this.s == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            dsa dsaVar4 = sparseArray.valueAt(i17).b;
                            dsaVar4.getClass();
                            dsaVar4.c = position4;
                            dsaVar4.b = position4;
                        }
                    }
                    int i18 = this.s;
                    if (i18 == 1835295092) {
                        this.B = null;
                        this.w = position4 + this.t;
                        this.r = 2;
                    } else if (i18 == 1836019574 || i18 == 1953653099 || i18 == 1835297121 || i18 == 1835626086 || i18 == 1937007212 || i18 == 1836019558 || i18 == 1953653094 || i18 == 1836475768 || i18 == 1701082227 || i18 == 1835365473) {
                        long position5 = ks3Var2.getPosition();
                        long j15 = this.t;
                        long j16 = (position5 + j15) - 8;
                        if (j15 != this.u && this.s == 1835365473) {
                            pt7Var.J(8);
                            ks3Var2.n(pt7Var.a, 0, 8);
                            iv0.a(pt7Var);
                            ks3Var2.m(pt7Var.b);
                            ks3Var2.l();
                        }
                        arrayDeque2.push(new sz6.a(this.s, j16));
                        if (this.t == this.u) {
                            l(j16);
                        } else {
                            h();
                        }
                    } else if (i18 == 1751411826 || i18 == 1835296868 || i18 == 1836476516 || i18 == 1936286840 || i18 == 1937011556 || i18 == 1937011827 || i18 == 1668576371 || i18 == 1937011555 || i18 == 1937011578 || i18 == 1937013298 || i18 == 1937007471 || i18 == 1668232756 || i18 == 1937011571 || i18 == 1952867444 || i18 == 1952868452 || i18 == 1953196132 || i18 == 1953654136 || i18 == 1953658222 || i18 == 1886614376 || i18 == 1935763834 || i18 == 1935763823 || i18 == 1936027235 || i18 == 1970628964 || i18 == 1935828848 || i18 == 1936158820 || i18 == 1701606260 || i18 == 1835362404 || i18 == 1701671783 || i18 == 1969517665 || i18 == 1801812339 || i18 == 1768715124) {
                        if (this.u != 8) {
                            throw ut7.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.t > 2147483647L) {
                            throw ut7.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        pt7 pt7Var6 = new pt7((int) this.t);
                        System.arraycopy(pt7Var5.a, 0, pt7Var6.a, 0, 8);
                        this.v = pt7Var6;
                        this.r = 1;
                    } else {
                        if (this.t > 2147483647L) {
                            throw ut7.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.v = null;
                        this.r = 1;
                    }
                }
            }
        }
        hsa hsaVar3 = bVar.a;
        dsa dsaVar5 = bVar.b;
        if (this.r == 3) {
            this.C = !bVar.m ? bVar.d.d[bVar.f] : dsaVar5.h[bVar.f];
            id4 id4Var = bVar.d.a.g;
            this.F = !((!Objects.equals(id4Var.o, "video/avc") ? !(!Objects.equals(id4Var.o, "video/hevc") || (i & 128) == 0) : (i & 64) != 0) ? false : z);
            if (bVar.f < bVar.i) {
                ks3Var2.m(this.C);
                csa csaVarB = bVar.b();
                if (csaVarB != null) {
                    pt7 pt7Var7 = dsaVar5.n;
                    int i19 = csaVarB.d;
                    if (i19 != 0) {
                        pt7Var7.N(i19);
                    }
                    int i20 = bVar.f;
                    if (dsaVar5.k && dsaVar5.l[i20]) {
                        pt7Var7.N(pt7Var7.G() * 6);
                    }
                }
                if (!bVar.c()) {
                    this.B = null;
                }
                this.r = 3;
                return 0;
            }
            if (bVar.d.a.h == z) {
                this.C -= 8;
                ks3Var2.m(i2);
            }
            boolean zEquals = "audio/ac4".equals(bVar.d.a.g.o);
            int i21 = this.C;
            if (zEquals) {
                this.D = bVar.d(i21, 7);
                j3.a(this.C, pt7Var);
                hsaVar3.e(7, pt7Var);
                this.D += 7;
                i5 = 0;
            } else {
                i5 = 0;
                this.D = bVar.d(i21, 0);
            }
            this.C += this.D;
            this.r = 4;
            this.E = i5;
        }
        isa isaVar = bVar.d;
        bsa bsaVar = isaVar.a;
        long jA3 = !bVar.m ? isaVar.f[bVar.f] : dsaVar5.i[bVar.f];
        if (apaVar != null) {
            jA3 = apaVar.a(jA3);
        }
        int i22 = bsaVar.k;
        id4 id4Var2 = bsaVar.g;
        if (i22 == 0) {
            bVar2 = bVar;
            while (true) {
                int i23 = this.D;
                int i24 = this.C;
                if (i23 >= i24) {
                    break;
                }
                this.D += hsaVar3.f(ks3Var2, i24 - i23, false);
            }
        } else {
            pt7 pt7Var8 = this.f;
            byte[] bArr2 = pt7Var8.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[r13] = 0;
            int i25 = 4 - i22;
            bVar2 = bVar;
            while (true) {
                i22 = i22;
                if (this.D < this.C) {
                    int i26 = this.E;
                    if (i26 == 0) {
                        if (this.J.length > 0 || !this.F) {
                            int iE2 = f47.e(id4Var2);
                            if (i22 + iE2 <= this.C - this.D) {
                                i4 = iE2;
                            } else {
                                i4 = 0;
                            }
                        } else {
                            i4 = 0;
                        }
                        ks3Var2.readFully(bArr2, i25, i22 + i4);
                        pt7Var8.M(0);
                        int iM = pt7Var8.m();
                        if (iM < 0) {
                            throw ut7.a(null, "Invalid NAL length");
                        }
                        this.E = iM - i4;
                        pt7 pt7Var9 = this.e;
                        i3 = i25;
                        pt7Var9.M(0);
                        hsaVar3.e(4, pt7Var9);
                        this.D += 4;
                        this.C += i3;
                        if (this.J.length > 0 && i4 > 0 && (strC = f47.c(id4Var2)) != null) {
                            switch (strC) {
                                case "video/hevc":
                                    if (((bArr2[4] & 126) >> 1) == 39) {
                                        z2 = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                case "video/avc":
                                    if ((bArr2[4] & 31) == 6) {
                                        z2 = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                case "video/vvc":
                                    if (((bArr2[5] & 248) >> 3) == 23) {
                                        z2 = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                default:
                                    z2 = false;
                                    break;
                            }
                        } else {
                            z2 = false;
                        }
                        this.G = z2;
                        hsaVar3.e(i4, pt7Var8);
                        this.D += i4;
                        if (i4 > 0 && !this.F && f47.d(bArr2, i4, id4Var2)) {
                            this.F = true;
                        }
                    } else {
                        i3 = i25;
                        if (this.G) {
                            pt7 pt7Var10 = this.g;
                            pt7Var10.J(i26);
                            ks3Var2.readFully(pt7Var10.a, 0, this.E);
                            hsaVar3.e(this.E, pt7Var10);
                            int i27 = this.E;
                            int iM2 = f47.m(pt7Var10.a, pt7Var10.c);
                            pt7Var10.M(0);
                            pt7Var10.L(iM2);
                            int i28 = id4Var2.q;
                            if (i28 == -1) {
                                if (pn8Var.e != 0) {
                                    pn8Var.c(0);
                                }
                            } else if (pn8Var.e != i28) {
                                pn8Var.c(i28);
                            }
                            pn8Var.a(jA3, pt7Var10);
                            if ((bVar2.a() & 4) != 0) {
                                pn8Var.b(0);
                            }
                            iF = i27;
                        } else {
                            iF = hsaVar3.f(ks3Var2, i26, false);
                        }
                        this.D += iF;
                        this.E -= iF;
                        pt7Var8 = pt7Var8;
                    }
                    i25 = i3;
                }
            }
        }
        int iA2 = bVar2.a();
        if (!this.F) {
            iA2 |= 67108864;
        }
        int i29 = iA2;
        csa csaVarB2 = bVar2.b();
        long j17 = jA3;
        hsaVar3.a(j17, i29, this.C, 0, csaVarB2 != null ? csaVarB2.c : null);
        while (!arrayDeque.isEmpty()) {
            a aVarRemoveFirst = arrayDeque.removeFirst();
            this.x -= aVarRemoveFirst.c;
            long jA4 = aVarRemoveFirst.a;
            if (aVarRemoveFirst.b) {
                jA4 += j17;
            }
            if (apaVar != null) {
                jA4 = apaVar.a(jA4);
            }
            long j18 = jA4;
            for (hsa hsaVar4 : this.I) {
                hsaVar4.a(j18, 1, aVarRemoveFirst.c, this.x, null);
            }
        }
        if (!bVar2.c()) {
            this.B = null;
        }
        this.r = 3;
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        ul8 ul8VarV;
        nv9 nv9VarI = ov9.i(ks3Var, true, false);
        if (nv9VarI != null) {
            ul8VarV = k95.v(nv9VarI);
        } else {
            k95.b bVar = k95.u;
            ul8VarV = ul8.x;
        }
        this.q = ul8VarV;
        return nv9VarI == null;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        SparseArray<b> sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).e();
        }
        this.n.clear();
        this.x = 0;
        this.o.d.clear();
        this.y = j2;
        this.m.clear();
        h();
    }

    @Override // defpackage.js3
    public final List f() {
        return this.q;
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            ls3Var = new a5a(ls3Var, this.a);
        }
        this.H = ls3Var;
        h();
        hsa[] hsaVarArr = new hsa[2];
        this.I = hsaVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            hsaVarArr[0] = this.H.p(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        hsa[] hsaVarArr2 = (hsa[]) n6b.P(i, this.I);
        this.I = hsaVarArr2;
        for (hsa hsaVar : hsaVarArr2) {
            hsaVar.g(O);
        }
        List<id4> list = this.c;
        this.J = new hsa[list.size()];
        while (i4 < this.J.length) {
            hsa hsaVarP = this.H.p(i3, 3);
            hsaVarP.g(list.get(i4));
            this.J[i4] = hsaVarP;
            i4++;
            i3++;
        }
    }

    public final void h() {
        this.r = 0;
        this.u = 0;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x066d  */
    public final void l(long j) throws ut7 {
        su6 su6Var;
        int i;
        long j2;
        bt2 bt2Var;
        int i2;
        bt2 bt2Var2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        while (true) {
            ArrayDeque<sz6.a> arrayDeque = this.m;
            if (arrayDeque.isEmpty() || arrayDeque.peek().b != j) {
                break;
            }
            sz6.a aVarPop = arrayDeque.pop();
            int i8 = aVarPop.a;
            ArrayList arrayList4 = aVarPop.d;
            ArrayList arrayList5 = aVarPop.c;
            int i9 = this.b;
            int i10 = 12;
            SparseArray<b> sparseArray = this.d;
            if (i8 == 1836019574) {
                h83 h83VarI = i(arrayList5);
                sz6.a aVarB = aVarPop.b(1836475768);
                aVarB.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = aVarB.c;
                int size = arrayList6.size();
                int i11 = 0;
                long jB = -9223372036854775807L;
                while (i11 < size) {
                    sz6.b bVar = (sz6.b) arrayList6.get(i11);
                    int i12 = bVar.a;
                    pt7 pt7Var = bVar.b;
                    if (i12 == 1953654136) {
                        pt7Var.M(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(pt7Var.m()), new bt2(pt7Var.m() - 1, pt7Var.m(), pt7Var.m(), pt7Var.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (bt2) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i12 == 1835362404) {
                            pt7Var.M(8);
                            jB = iv0.e(pt7Var.m()) == 0 ? pt7Var.B() : pt7Var.F();
                        }
                    }
                    i11++;
                    arrayList6 = arrayList;
                    i10 = 12;
                }
                int i13 = 0;
                sz6.a aVarB2 = aVarPop.b(1835365473);
                su6 su6VarF = aVarB2 != null ? iv0.f(aVarB2) : null;
                lj4 lj4Var = new lj4();
                sz6.b bVarC = aVarPop.c(1969517665);
                if (bVarC != null) {
                    su6 su6VarK = iv0.k(bVarC);
                    lj4Var.b(su6VarK);
                    su6Var = su6VarK;
                } else {
                    su6Var = null;
                }
                sz6.b bVarC2 = aVarPop.c(1836476516);
                bVarC2.getClass();
                su6 su6Var2 = new su6(iv0.g(bVarC2.b));
                ArrayList arrayListJ = iv0.j(aVarPop, lj4Var, jB, h83VarI, (i9 & 16) != 0, false, new zg4(), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strD = l96.d(arrayListJ);
                    int i14 = 0;
                    while (i14 < size2) {
                        isa isaVar = (isa) arrayListJ.get(i14);
                        bsa bsaVar = isaVar.a;
                        ls3 ls3Var = this.H;
                        int i15 = bsaVar.b;
                        int i16 = bsaVar.a;
                        String str = strD;
                        id4 id4Var = bsaVar.g;
                        long j3 = bsaVar.e;
                        hsa hsaVarP = ls3Var.p(i14, i15);
                        hsaVarP.d(j3);
                        int i17 = i14;
                        id4.a aVarA = id4Var.a();
                        ArrayList arrayList7 = arrayListJ;
                        aVarA.m = fv6.n(str);
                        if (i15 == 1) {
                            int i18 = lj4Var.a;
                            i = size2;
                            j2 = j3;
                            if (i18 != -1 && (i2 = lj4Var.b) != -1) {
                                aVarA.I = i18;
                                aVarA.J = i2;
                            }
                        } else {
                            i = size2;
                            j2 = j3;
                        }
                        bv6.f(i15, su6VarF, aVarA, id4Var.l, su6Var, su6Var2);
                        if (sparseArray2.size() == 1) {
                            bt2Var = (bt2) sparseArray2.valueAt(i13);
                        } else {
                            bt2Var = (bt2) sparseArray2.get(i16);
                            bt2Var.getClass();
                        }
                        sparseArray.put(i16, new b(hsaVarP, isaVar, bt2Var, new id4(aVarA)));
                        this.z = Math.max(this.z, j2);
                        i14 = i17 + 1;
                        strD = str;
                        arrayListJ = arrayList7;
                        size2 = i;
                        i13 = 0;
                    }
                    this.H.k();
                } else {
                    ArrayList arrayList8 = arrayListJ;
                    xl7.r(sparseArray.size() == size2);
                    int i19 = 0;
                    while (i19 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        isa isaVar2 = (isa) arrayList9.get(i19);
                        bsa bsaVar2 = isaVar2.a;
                        b bVar2 = sparseArray.get(bsaVar2.a);
                        int i20 = bsaVar2.a;
                        if (sparseArray2.size() == 1) {
                            bt2Var2 = (bt2) sparseArray2.valueAt(0);
                        } else {
                            bt2Var2 = (bt2) sparseArray2.get(i20);
                            bt2Var2.getClass();
                        }
                        bVar2.d = isaVar2;
                        bVar2.e = bt2Var2;
                        bVar2.a.g(bVar2.j);
                        bVar2.e();
                        i19++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i8 == 1836019558) {
                int size3 = arrayList4.size();
                int i21 = 0;
                while (i21 < size3) {
                    sz6.a aVar = (sz6.a) arrayList4.get(i21);
                    if (aVar.a == 1953653094) {
                        sz6.b bVarC3 = aVar.c(1952868452);
                        ArrayList arrayList10 = aVar.c;
                        bVarC3.getClass();
                        pt7 pt7Var2 = bVarC3.b;
                        pt7Var2.M(8);
                        int iM = pt7Var2.m();
                        byte[] bArr2 = iv0.a;
                        b bVar3 = sparseArray.get(pt7Var2.m());
                        if (bVar3 == null) {
                            size3 = size3;
                            bVar3 = null;
                        } else {
                            dsa dsaVar = bVar3.b;
                            if ((iM & 1) != 0) {
                                long jF = pt7Var2.F();
                                dsaVar.b = jF;
                                dsaVar.c = jF;
                            }
                            bt2 bt2Var3 = bVar3.e;
                            dsaVar.a = new bt2((iM & 2) != 0 ? pt7Var2.m() - 1 : bt2Var3.a, (iM & 8) != 0 ? pt7Var2.m() : bt2Var3.b, (iM & 16) != 0 ? pt7Var2.m() : bt2Var3.c, (iM & 32) != 0 ? pt7Var2.m() : bt2Var3.d);
                        }
                        if (bVar3 != null) {
                            dsa dsaVar2 = bVar3.b;
                            long j4 = dsaVar2.p;
                            boolean z3 = dsaVar2.q;
                            bVar3.e();
                            bVar3.m = true;
                            sz6.b bVarC4 = aVar.c(1952867444);
                            if (bVarC4 == null || (i9 & 2) != 0) {
                                dsaVar2.p = j4;
                                dsaVar2.q = z3;
                            } else {
                                pt7 pt7Var3 = bVarC4.b;
                                pt7Var3.M(8);
                                dsaVar2.p = iv0.e(pt7Var3.m()) == 1 ? pt7Var3.F() : pt7Var3.B();
                                dsaVar2.q = true;
                            }
                            int size4 = arrayList10.size();
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                i5 = 1953658222;
                                if (i22 >= size4) {
                                    break;
                                }
                                sz6.b bVar4 = (sz6.b) arrayList10.get(i22);
                                int i25 = i21;
                                if (bVar4.a == 1953658222) {
                                    pt7 pt7Var4 = bVar4.b;
                                    pt7Var4.M(12);
                                    int iD = pt7Var4.D();
                                    if (iD > 0) {
                                        i24 += iD;
                                        i23++;
                                    }
                                }
                                i22++;
                                i21 = i25;
                            }
                            i3 = i21;
                            bVar3.h = 0;
                            bVar3.g = 0;
                            bVar3.f = 0;
                            dsaVar2.d = i23;
                            dsaVar2.e = i24;
                            if (dsaVar2.g.length < i23) {
                                dsaVar2.f = new long[i23];
                                dsaVar2.g = new int[i23];
                            }
                            if (dsaVar2.h.length < i24) {
                                int i26 = (i24 * 125) / 100;
                                dsaVar2.h = new int[i26];
                                dsaVar2.i = new long[i26];
                                dsaVar2.j = new boolean[i26];
                                dsaVar2.l = new boolean[i26];
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                long j5 = 0;
                                if (i27 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i4 = i9;
                                    bsa bsaVar3 = bVar3.d.a;
                                    bt2 bt2Var4 = dsaVar2.a;
                                    bt2Var4.getClass();
                                    csa csaVar = bsaVar3.l[bt2Var4.a];
                                    sz6.b bVarC5 = aVar.c(1935763834);
                                    if (bVarC5 != null) {
                                        csaVar.getClass();
                                        pt7 pt7Var5 = bVarC5.b;
                                        int i30 = csaVar.d;
                                        pt7Var5.M(8);
                                        int iM2 = pt7Var5.m();
                                        byte[] bArr3 = iv0.a;
                                        if ((iM2 & 1) == 1) {
                                            pt7Var5.N(8);
                                        }
                                        int iZ = pt7Var5.z();
                                        int iD2 = pt7Var5.D();
                                        if (iD2 > dsaVar2.e) {
                                            StringBuilder sbB = t43.b(iD2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbB.append(dsaVar2.e);
                                            throw ut7.a(null, sbB.toString());
                                        }
                                        if (iZ == 0) {
                                            boolean[] zArr = dsaVar2.l;
                                            i6 = 0;
                                            for (int i31 = 0; i31 < iD2; i31++) {
                                                int iZ2 = pt7Var5.z();
                                                i6 += iZ2;
                                                zArr[i31] = iZ2 > i30;
                                            }
                                            z = false;
                                        } else {
                                            boolean z4 = iZ > i30;
                                            i6 = iZ * iD2;
                                            z = false;
                                            Arrays.fill(dsaVar2.l, 0, iD2, z4);
                                        }
                                        Arrays.fill(dsaVar2.l, iD2, dsaVar2.e, z);
                                        if (i6 > 0) {
                                            dsaVar2.n.J(i6);
                                            dsaVar2.k = true;
                                            dsaVar2.o = true;
                                        }
                                    }
                                    sz6.b bVarC6 = aVar.c(1935763823);
                                    if (bVarC6 != null) {
                                        pt7 pt7Var6 = bVarC6.b;
                                        pt7Var6.M(8);
                                        int iM3 = pt7Var6.m();
                                        byte[] bArr4 = iv0.a;
                                        if ((iM3 & 1) == 1) {
                                            pt7Var6.N(8);
                                        }
                                        int iD3 = pt7Var6.D();
                                        if (iD3 != 1) {
                                            throw ut7.a(null, "Unexpected saio entry count: " + iD3);
                                        }
                                        dsaVar2.c += iv0.e(iM3) == 0 ? pt7Var6.B() : pt7Var6.F();
                                    }
                                    sz6.b bVarC7 = aVar.c(1936027235);
                                    if (bVarC7 != null) {
                                        j(bVarC7.b, 0, dsaVar2);
                                    }
                                    String str2 = csaVar != null ? csaVar.b : null;
                                    pt7 pt7Var7 = null;
                                    pt7 pt7Var8 = null;
                                    for (int i32 = 0; i32 < arrayList10.size(); i32++) {
                                        sz6.b bVar5 = (sz6.b) arrayList10.get(i32);
                                        pt7 pt7Var9 = bVar5.b;
                                        int i33 = bVar5.a;
                                        if (i33 == 1935828848) {
                                            pt7Var9.M(12);
                                            if (pt7Var9.m() == 1936025959) {
                                                pt7Var7 = pt7Var9;
                                            }
                                        } else if (i33 == 1936158820) {
                                            pt7Var9.M(12);
                                            if (pt7Var9.m() == 1936025959) {
                                                pt7Var8 = pt7Var9;
                                            }
                                        }
                                    }
                                    if (pt7Var7 != null && pt7Var8 != null) {
                                        pt7Var7.M(8);
                                        int iE = iv0.e(pt7Var7.m());
                                        pt7Var7.N(4);
                                        if (iE == 1) {
                                            pt7Var7.N(4);
                                        }
                                        if (pt7Var7.m() != 1) {
                                            throw ut7.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        pt7Var8.M(8);
                                        int iE2 = iv0.e(pt7Var8.m());
                                        pt7Var8.N(4);
                                        if (iE2 == 1) {
                                            if (pt7Var8.B() == 0) {
                                                throw ut7.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE2 >= 2) {
                                            pt7Var8.N(4);
                                        }
                                        if (pt7Var8.B() != 1) {
                                            throw ut7.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        pt7Var8.N(1);
                                        int iZ3 = pt7Var8.z();
                                        int i34 = (iZ3 & 240) >> 4;
                                        int i35 = iZ3 & 15;
                                        boolean z5 = pt7Var8.z() == 1;
                                        if (z5) {
                                            int iZ4 = pt7Var8.z();
                                            byte[] bArr5 = new byte[16];
                                            pt7Var8.k(bArr5, 0, 16);
                                            if (iZ4 == 0) {
                                                int iZ5 = pt7Var8.z();
                                                byte[] bArr6 = new byte[iZ5];
                                                pt7Var8.k(bArr6, 0, iZ5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            dsaVar2.k = true;
                                            dsaVar2.m = new csa(z5, str2, iZ4, bArr5, i34, i35, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i36 = 0; i36 < size5; i36++) {
                                        sz6.b bVar6 = (sz6.b) arrayList10.get(i36);
                                        if (bVar6.a == 1970628964) {
                                            pt7 pt7Var10 = bVar6.b;
                                            pt7Var10.M(8);
                                            byte[] bArr7 = this.h;
                                            pt7Var10.k(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, N)) {
                                                j(pt7Var10, 16, dsaVar2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                sz6.b bVar7 = (sz6.b) arrayList10.get(i27);
                                if (bVar7.a == i5) {
                                    int i37 = i28 + 1;
                                    pt7 pt7Var11 = bVar7.b;
                                    pt7Var11.M(8);
                                    int iM4 = pt7Var11.m();
                                    byte[] bArr8 = iv0.a;
                                    bsa bsaVar4 = bVar3.d.a;
                                    bt2 bt2Var5 = dsaVar2.a;
                                    String str3 = n6b.a;
                                    dsaVar2.g[i28] = pt7Var11.D();
                                    long[] jArr = dsaVar2.f;
                                    i7 = i9;
                                    long j6 = dsaVar2.b;
                                    jArr[i28] = j6;
                                    if ((iM4 & 1) != 0) {
                                        jArr[i28] = j6 + ((long) pt7Var11.m());
                                    }
                                    boolean z6 = (iM4 & 4) != 0;
                                    int iM5 = bt2Var5.d;
                                    if (z6) {
                                        iM5 = pt7Var11.m();
                                    }
                                    boolean z7 = (iM4 & 256) != 0;
                                    boolean z8 = z6;
                                    boolean z9 = (iM4 & 512) != 0;
                                    boolean z10 = (iM4 & 1024) != 0;
                                    boolean z11 = (iM4 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0;
                                    boolean z12 = z10;
                                    long[] jArr2 = bsaVar4.i;
                                    int i38 = iM5;
                                    long[] jArr3 = bsaVar4.j;
                                    if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                        z2 = z7;
                                    } else {
                                        long j7 = jArr2[0];
                                        if (j7 == 0) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            long j8 = bsaVar4.d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (n6b.U(j7, 1000000L, j8, roundingMode) + n6b.U(jArr3[0], 1000000L, bsaVar4.c, roundingMode) >= bsaVar4.e) {
                                            }
                                        }
                                        j5 = jArr3[0];
                                    }
                                    int[] iArr = dsaVar2.h;
                                    long[] jArr4 = dsaVar2.i;
                                    boolean z13 = z2;
                                    boolean[] zArr2 = dsaVar2.j;
                                    boolean z14 = bsaVar4.b == 2 && (i7 & 1) != 0;
                                    int i39 = dsaVar2.g[i28] + i29;
                                    int i40 = i29;
                                    long j9 = bsaVar4.c;
                                    boolean z15 = z11;
                                    long j10 = dsaVar2.p;
                                    int i41 = i40;
                                    while (i41 < i39) {
                                        int iM6 = z13 ? pt7Var11.m() : bt2Var5.b;
                                        boolean z16 = z15;
                                        if (iM6 < 0) {
                                            throw ut7.a(null, "Unexpected negative value: " + iM6);
                                        }
                                        int iM7 = z9 ? pt7Var11.m() : bt2Var5.c;
                                        if (iM7 < 0) {
                                            throw ut7.a(null, "Unexpected negative value: " + iM7);
                                        }
                                        int iM8 = z12 ? pt7Var11.m() : (i41 == 0 && z8) ? i38 : bt2Var5.d;
                                        int i42 = i39;
                                        long[] jArr5 = jArr4;
                                        long jU = n6b.U((((long) (z16 ? pt7Var11.m() : 0)) + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                        jArr5[i41] = jU;
                                        if (!dsaVar2.q) {
                                            jArr5[i41] = jU + bVar3.d.i;
                                        }
                                        iArr[i41] = iM7;
                                        zArr2[i41] = ((iM8 >> 16) & 1) == 0 && (!z14 || i41 == 0);
                                        j10 += (long) iM6;
                                        i41++;
                                        z15 = z16;
                                        z14 = z14;
                                        jArr4 = jArr5;
                                        i39 = i42;
                                    }
                                    dsaVar2.p = j10;
                                    i28 = i37;
                                    i29 = i39;
                                } else {
                                    i7 = i9;
                                }
                                i27++;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i9 = i7;
                                size4 = size4;
                                i5 = 1953658222;
                            }
                        } else {
                            i3 = i21;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i4 = i9;
                        }
                    } else {
                        size3 = size3;
                        i3 = i21;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i4 = i9;
                    }
                    i21 = i3 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i9 = i4;
                }
                h83 h83VarI2 = i(arrayList5);
                if (h83VarI2 != null) {
                    int size6 = sparseArray.size();
                    for (int i43 = 0; i43 < size6; i43++) {
                        b bVarValueAt = sparseArray.valueAt(i43);
                        bsa bsaVar5 = bVarValueAt.d.a;
                        bt2 bt2Var6 = bVarValueAt.b.a;
                        String str4 = n6b.a;
                        csa csaVar2 = bsaVar5.l[bt2Var6.a];
                        h83 h83VarA = h83VarI2.a(csaVar2 != null ? csaVar2.b : null);
                        id4.a aVarA2 = bVarValueAt.j.a();
                        aVarA2.r = h83VarA;
                        bVarValueAt.a.g(new id4(aVarA2));
                    }
                }
                if (this.y != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i44 = 0; i44 < size7; i44++) {
                        b bVarValueAt2 = sparseArray.valueAt(i44);
                        long j11 = this.y;
                        int i45 = bVarValueAt2.f;
                        while (true) {
                            dsa dsaVar3 = bVarValueAt2.b;
                            if (i45 >= dsaVar3.e || dsaVar3.i[i45] > j11) {
                                break;
                            }
                            if (dsaVar3.j[i45]) {
                                bVarValueAt2.i = i45;
                            }
                            i45++;
                        }
                    }
                    this.y = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                arrayDeque.peek().d.add(aVarPop);
            }
        }
        h();
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
