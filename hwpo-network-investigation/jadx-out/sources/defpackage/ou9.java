package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ou9 implements Iterable<Long>, zn5 {
    public static final ou9 x = new ou9(0, 0, 0, null);
    public final long t;
    public final long u;
    public final long v;
    public final long[] w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend", v = 1)
    public static final class a extends zu8 implements ci4<ad9<? super Long>, r02<? super g2b>, Object> {
        public long[] u;
        public int v;
        public int w;
        public int x;
        public /* synthetic */ Object y;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = ou9.this.new a(r02Var);
            aVar.y = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(ad9<? super Long> ad9Var, r02<? super g2b> r02Var) {
            return ((a) create(ad9Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0078  */
        /* JADX WARN: Code duplicated, block: B:24:0x0080  */
        /* JADX WARN: Code duplicated, block: B:27:0x0095  */
        /* JADX WARN: Code duplicated, block: B:30:0x009a  */
        /* JADX WARN: Code duplicated, block: B:32:0x009e  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:26:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0095
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                ou9 r1 = defpackage.ou9.this
                long r2 = r1.t
                long r4 = r1.v
                long r6 = r1.u
                int r8 = r0.x
                r9 = 0
                r12 = 64
                r13 = 3
                r14 = 2
                r16 = 0
                r18 = 1
                r10 = 1
                v72 r11 = defpackage.v72.t
                if (r8 == 0) goto L4b
                if (r8 == r10) goto L3c
                if (r8 == r14) goto L32
                if (r8 != r13) goto L2c
                int r1 = r0.v
                java.lang.Object r6 = r0.y
                ad9 r6 = (defpackage.ad9) r6
                defpackage.dv8.b(r23)
                r7 = r13
                goto Lbe
            L2c:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r0)
                return r9
            L32:
                int r1 = r0.v
                java.lang.Object r8 = r0.y
                ad9 r8 = (defpackage.ad9) r8
                defpackage.dv8.b(r23)
                goto L93
            L3c:
                int r1 = r0.w
                int r8 = r0.v
                long[] r15 = r0.u
                java.lang.Object r13 = r0.y
                ad9 r13 = (defpackage.ad9) r13
                defpackage.dv8.b(r23)
                int r8 = r8 + r10
                goto L59
            L4b:
                defpackage.dv8.b(r23)
                java.lang.Object r8 = r0.y
                r13 = r8
                ad9 r13 = (defpackage.ad9) r13
                long[] r15 = r1.w
                if (r15 == 0) goto L70
                int r1 = r15.length
                r8 = 0
            L59:
                if (r8 >= r1) goto L70
                r2 = r15[r8]
                java.lang.Long r4 = new java.lang.Long
                r4.<init>(r2)
                r0.y = r13
                r0.u = r15
                r0.v = r8
                r0.w = r1
                r0.x = r10
                r13.a(r0, r4)
                return r11
            L70:
                int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
                if (r1 == 0) goto L96
                r8 = r13
                r1 = 0
            L76:
                if (r1 >= r12) goto L95
                long r20 = r18 << r1
                long r20 = r6 & r20
                int r13 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
                if (r13 == 0) goto L93
                long r2 = (long) r1
                long r4 = r4 + r2
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r4)
                r0.y = r8
                r0.u = r9
                r0.v = r1
                r0.x = r14
                r8.a(r0, r2)
                return r11
            L93:
                int r1 = r1 + r10
                goto L76
            L95:
                r13 = r8
            L96:
                int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r1 == 0) goto Lc1
                r6 = r13
                r15 = 0
            L9c:
                if (r15 >= r12) goto Lc1
                long r7 = r18 << r15
                long r7 = r7 & r2
                int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r1 == 0) goto Lbc
                long r1 = (long) r15
                long r4 = r4 + r1
                r1 = 64
                long r4 = r4 + r1
                java.lang.Long r1 = new java.lang.Long
                r1.<init>(r4)
                r0.y = r6
                r0.u = r9
                r0.v = r15
                r7 = 3
                r0.x = r7
                r6.a(r0, r1)
                return r11
            Lbc:
                r7 = 3
                r1 = r15
            Lbe:
                int r15 = r1 + 1
                goto L9c
            Lc1:
                g2b r0 = defpackage.g2b.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ou9.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ou9(long j, long j2, long j3, long[] jArr) {
        this.t = j;
        this.u = j2;
        this.v = j3;
        this.w = jArr;
    }

    public final ou9 d(ou9 ou9Var) {
        long[] jArr;
        ou9 ou9VarE = this;
        ou9 ou9Var2 = x;
        if (ou9Var == ou9Var2) {
            return ou9VarE;
        }
        if (ou9VarE == ou9Var2) {
            return ou9Var2;
        }
        long j = ou9Var.v;
        long j2 = ou9Var.v;
        long[] jArr2 = ou9Var.w;
        long j3 = ou9Var.u;
        long j4 = ou9Var.t;
        long j5 = ou9VarE.v;
        if (j == j5 && jArr2 == (jArr = ou9VarE.w)) {
            return new ou9(ou9VarE.t & (~j4), ou9VarE.u & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                ou9VarE = ou9VarE.e(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    ou9VarE = ou9VarE.e(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    ou9VarE = ou9VarE.e(((long) i2) + j2 + 64);
                }
            }
        }
        return ou9VarE;
    }

    public final ou9 e(long j) {
        long[] jArr;
        int iB;
        long[] jArr2;
        long j2 = j - this.v;
        if (xj5.c(j2, 0L) >= 0 && xj5.c(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.u;
            if ((j4 & j3) != 0) {
                return new ou9(this.t, j4 & (~j3), this.v, this.w);
            }
        } else if (xj5.c(j2, 64L) >= 0 && xj5.c(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.t;
            if ((j6 & j5) != 0) {
                return new ou9(j6 & (~j5), this.u, this.v, this.w);
            }
        } else if (xj5.c(j2, 0L) < 0 && (jArr = this.w) != null && (iB = pu9.b(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iB > 0) {
                    gz3.g(jArr, jArr3, 0, 0, iB);
                }
                if (iB < i) {
                    gz3.g(jArr, jArr3, iB, iB + 1, length);
                }
                jArr2 = jArr3;
            }
            return new ou9(this.t, this.u, this.v, jArr2);
        }
        return this;
    }

    public final boolean f(long j) {
        long[] jArr;
        long j2 = j - this.v;
        if (xj5.c(j2, 0L) >= 0 && xj5.c(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.u) != 0;
        }
        if (xj5.c(j2, 64L) < 0 || xj5.c(j2, 128L) >= 0) {
            return xj5.c(j2, 0L) <= 0 && (jArr = this.w) != null && pu9.b(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.t) != 0;
    }

    public final ou9 i(ou9 ou9Var) {
        ou9 ou9VarJ;
        long[] jArr;
        ou9 ou9VarJ2 = this;
        ou9 ou9Var2 = x;
        if (ou9Var == ou9Var2) {
            return ou9VarJ2;
        }
        if (ou9VarJ2 == ou9Var2) {
            return ou9Var;
        }
        long j = ou9Var.v;
        long j2 = ou9Var.v;
        long[] jArr2 = ou9Var.w;
        long j3 = ou9Var.u;
        long j4 = ou9Var.t;
        long j5 = ou9VarJ2.v;
        long j6 = ou9VarJ2.u;
        long j7 = ou9VarJ2.t;
        if (j == j5 && jArr2 == (jArr = ou9VarJ2.w)) {
            return new ou9(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = ou9VarJ2.w;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    ou9VarJ2 = ou9VarJ2.j(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        ou9VarJ2 = ou9VarJ2.j(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        ou9VarJ2 = ou9VarJ2.j(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return ou9VarJ2;
        }
        if (jArr3 != null) {
            ou9VarJ = ou9Var;
            for (long j9 : jArr3) {
                ou9VarJ = ou9VarJ.j(j9);
            }
        } else {
            ou9VarJ = ou9Var;
        }
        long j10 = ou9VarJ2.v;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    ou9VarJ = ou9VarJ.j(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    ou9VarJ = ou9VarJ.j(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return ou9VarJ;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return xs.b(new a(null));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    public final ou9 j(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.v;
        long j5 = j - j4;
        long j6 = 0;
        int iC = xj5.c(j5, 0L);
        long j7 = this.u;
        if (iC < 0 || xj5.c(j5, 64L) >= 0) {
            int iC2 = xj5.c(j5, 64L);
            long j8 = this.t;
            int i2 = 64;
            if (iC2 < 0 || xj5.c(j5, 128L) >= 0) {
                int iC3 = xj5.c(j5, 128L);
                long[] jArr3 = this.w;
                if (iC3 < 0) {
                    if (jArr3 == null) {
                        return new ou9(this.t, this.u, this.v, new long[]{j});
                    }
                    int iB = pu9.b(jArr3, j);
                    if (iB < 0) {
                        int i3 = -(iB + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        gz3.g(jArr3, jArr4, 0, 0, i3);
                        gz3.g(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new ou9(this.t, this.u, this.v, jArr4);
                    }
                } else if (!f(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (xj5.c(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    nu9 nu9Var = null;
                    while (true) {
                        if (xj5.c(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (nu9Var == null) {
                                nu9Var = new nu9(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    nu9Var.a.a(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (nu9Var == null) {
                        jArr = jArr3;
                    } else {
                        m27 m27Var = nu9Var.a;
                        int i5 = m27Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = m27Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new ou9(j10, j3, j2, jArr).j(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new ou9(j8 | j12, this.u, this.v, this.w);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new ou9(this.t, j7 | j13, this.v, this.w);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(ph1.n(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) BuildConfig.FLAVOR);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) BuildConfig.FLAVOR);
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
