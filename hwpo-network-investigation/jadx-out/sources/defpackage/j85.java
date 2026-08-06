package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.l;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j85 extends androidx.media3.exoplayer.a {
    public final lq0.a L;
    public final nn2 M;
    public final ArrayDeque<a> N;
    public boolean O;
    public boolean P;
    public a Q;
    public long R;
    public long S;
    public int T;
    public int U;
    public id4 V;
    public lq0 W;
    public nn2 X;
    public ImageOutput Y;
    public g85 Z;
    public Bitmap a0;
    public boolean b0;
    public b c0;
    public b d0;
    public int e0;
    public boolean f0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final int a;
        public final long b;
        public Bitmap c;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public j85(lq0.a aVar) {
        super(4);
        this.L = aVar;
        this.Y = ImageOutput.a;
        this.M = new nn2(0);
        this.Q = a.c;
        this.N = new ArrayDeque<>();
        this.S = -9223372036854775807L;
        this.R = -9223372036854775807L;
        this.T = 0;
        this.U = 1;
    }

    @Override // androidx.media3.exoplayer.a
    public final void H() {
        this.V = null;
        this.Q = a.c;
        this.N.clear();
        U();
        this.Y.a();
    }

    @Override // androidx.media3.exoplayer.a
    public final void I(boolean z, boolean z2) {
        this.U = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.a
    public final void J(long j, boolean z, boolean z2) {
        this.U = Math.min(this.U, 1);
        this.P = false;
        this.O = false;
        this.a0 = null;
        this.c0 = null;
        this.d0 = null;
        this.b0 = false;
        this.X = null;
        lq0 lq0Var = this.W;
        if (lq0Var != null) {
            lq0Var.flush();
        }
        this.N.clear();
    }

    @Override // androidx.media3.exoplayer.a
    public final void K() {
        U();
    }

    @Override // androidx.media3.exoplayer.a
    public final void L() {
        U();
        this.U = Math.min(this.U, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(defpackage.id4[] r5, long r6, long r8, bq6.b r10) {
        /*
            r4 = this;
            j85$a r5 = r4.Q
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque<j85$a> r5 = r4.N
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.S
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.R
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            j85$a r6 = new j85$a
            long r0 = r4.S
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            j85$a r5 = new j85$a
            r5.<init>(r0, r8)
            r4.Q = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j85.O(id4[], long, long, bq6$b):void");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    public final boolean R(long j) throws lo3 {
        boolean z;
        b bVar;
        boolean z2;
        int i;
        g85 g85Var;
        int i2;
        int i3;
        id4 id4Var;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.a0;
        if ((bitmap == null || this.c0 != null) && (this.U != 0 || this.A == 2)) {
            ArrayDeque<a> arrayDeque = this.N;
            if (bitmap == null) {
                this.W.getClass();
                h85 h85VarL = this.W.d();
                if (h85VarL != null) {
                    if (!h85VarL.i(4)) {
                        xl7.n(h85VarL.w, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.a0 = h85VarL.w;
                        h85VarL.k();
                        if (this.b0 && this.a0 != null && this.c0 != null) {
                            this.V.getClass();
                            id4 id4Var2 = this.V;
                            int i4 = id4Var2.N;
                            int i5 = id4Var2.O;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            bVar = this.c0;
                            if (bVar.c == null) {
                                if (z) {
                                    int i6 = bVar.a;
                                    this.a0.getClass();
                                    int width = this.a0.getWidth();
                                    id4 id4Var3 = this.V;
                                    id4Var3.getClass();
                                    int i7 = width / id4Var3.N;
                                    int height = this.a0.getHeight();
                                    id4 id4Var4 = this.V;
                                    id4Var4.getClass();
                                    int i8 = height / id4Var4.O;
                                    int i9 = this.V.N;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.a0, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.a0;
                                    bitmapCreateBitmap.getClass();
                                }
                                bVar.c = bitmapCreateBitmap;
                            }
                            Bitmap bitmap2 = this.c0.c;
                            bitmap2.getClass();
                            long j2 = this.c0.b;
                            long j3 = j2 - j;
                            if (this.A == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.U;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        d43.c();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < AudioConstants.TRANSCRIPTION_TIMEOUT_MS) {
                                g85Var = this.Z;
                                if (g85Var != null) {
                                    long j4 = this.Q.b;
                                    this.V.getClass();
                                    g85Var.a();
                                }
                                this.Y.onImageAvailable(j2 - this.Q.b, bitmap2);
                                b bVar2 = this.c0;
                                bVar2.getClass();
                                long j5 = bVar2.b;
                                this.R = j5;
                                while (!arrayDeque.isEmpty() && j5 >= arrayDeque.peek().a) {
                                    this.Q = arrayDeque.removeFirst();
                                }
                                this.U = 3;
                                if (z) {
                                    b bVar3 = this.c0;
                                    bVar3.getClass();
                                    i2 = bVar3.a;
                                    id4 id4Var5 = this.V;
                                    id4Var5.getClass();
                                    i3 = id4Var5.O;
                                    id4Var = this.V;
                                    id4Var.getClass();
                                    if (i2 == (i3 * id4Var.N) - 1) {
                                        this.a0 = null;
                                    }
                                } else {
                                    this.a0 = null;
                                }
                                this.c0 = this.d0;
                                this.d0 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.T == 3) {
                            U();
                            this.V.getClass();
                            T();
                            return false;
                        }
                        h85VarL.k();
                        if (arrayDeque.isEmpty()) {
                            this.P = true;
                            return false;
                        }
                    }
                }
            } else if (this.b0) {
                this.V.getClass();
                id4 id4Var6 = this.V;
                int i10 = id4Var6.N;
                int i11 = id4Var6.O;
                if (i10 != 1) {
                }
                bVar = this.c0;
                if (bVar.c == null) {
                    if (z) {
                        int i12 = bVar.a;
                        this.a0.getClass();
                        int width2 = this.a0.getWidth();
                        id4 id4Var7 = this.V;
                        id4Var7.getClass();
                        int i13 = width2 / id4Var7.N;
                        int height2 = this.a0.getHeight();
                        id4 id4Var8 = this.V;
                        id4Var8.getClass();
                        int i14 = height2 / id4Var8.O;
                        int i15 = this.V.N;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.a0, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.a0;
                        bitmapCreateBitmap.getClass();
                    }
                    bVar.c = bitmapCreateBitmap;
                }
                Bitmap bitmap3 = this.c0.c;
                bitmap3.getClass();
                long j6 = this.c0.b;
                long j7 = j6 - j;
                if (this.A == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.U;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            d43.c();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                g85Var = this.Z;
                if (g85Var != null) {
                    long j8 = this.Q.b;
                    this.V.getClass();
                    g85Var.a();
                }
                this.Y.onImageAvailable(j6 - this.Q.b, bitmap3);
                b bVar4 = this.c0;
                bVar4.getClass();
                long j9 = bVar4.b;
                this.R = j9;
                while (!arrayDeque.isEmpty()) {
                    this.Q = arrayDeque.removeFirst();
                }
                this.U = 3;
                if (z) {
                    b bVar5 = this.c0;
                    bVar5.getClass();
                    i2 = bVar5.a;
                    id4 id4Var9 = this.V;
                    id4Var9.getClass();
                    i3 = id4Var9.O;
                    id4Var = this.V;
                    id4Var.getClass();
                    if (i2 == (i3 * id4Var.N) - 1) {
                        this.a0 = null;
                    }
                } else {
                    this.a0 = null;
                }
                this.c0 = this.d0;
                this.d0 = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:0x013f  */
    public final boolean S(long j) {
        int i;
        nn2 nn2Var;
        int iQ;
        ByteBuffer byteBuffer;
        nn2 nn2Var2;
        boolean z;
        nn2 nn2Var3;
        long j2;
        boolean z2;
        b bVar;
        boolean z3;
        id4 id4Var;
        boolean z4;
        boolean z5;
        id4 id4Var2;
        int i2;
        nn2 nn2Var4;
        if (!this.b0 || this.c0 == null) {
            jd4 jd4Var = this.v;
            jd4Var.a();
            lq0 lq0Var = this.W;
            if (lq0Var != null && this.T != 3 && !this.O) {
                if (this.X == null) {
                    nn2 nn2Var5 = (nn2) lq0Var.e();
                    this.X = nn2Var5;
                    if (nn2Var5 != null) {
                        i = this.T;
                        nn2Var = this.X;
                        if (i == 2) {
                            nn2Var.getClass();
                            this.X.t = 4;
                            lq0 lq0Var2 = this.W;
                            lq0Var2.getClass();
                            lq0Var2.f(this.X);
                            this.X = null;
                            this.T = 3;
                            return false;
                        }
                        iQ = Q(jd4Var, nn2Var, 0);
                        if (iQ != -5) {
                            id4 id4Var3 = jd4Var.b;
                            id4Var3.getClass();
                            this.V = id4Var3;
                            this.f0 = true;
                            this.T = 2;
                            return true;
                        }
                        if (iQ != -4) {
                            this.X.m();
                            byteBuffer = this.X.w;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                nn2Var2 = this.X;
                                nn2Var2.getClass();
                                if (nn2Var2.i(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                nn2 nn2Var6 = this.X;
                                nn2Var6.getClass();
                                nn2Var6.u = this.V;
                                lq0 lq0Var3 = this.W;
                                lq0Var3.getClass();
                                nn2 nn2Var7 = this.X;
                                nn2Var7.getClass();
                                lq0Var3.f(nn2Var7);
                                this.e0 = 0;
                            }
                            nn2Var3 = this.X;
                            nn2Var3.getClass();
                            if (nn2Var3.i(4)) {
                                this.b0 = true;
                            } else {
                                int i3 = this.e0;
                                j2 = nn2Var3.y;
                                this.d0 = new b(i3, j2);
                                this.e0 = i3 + 1;
                                if (this.b0) {
                                    this.c0 = this.d0;
                                    this.d0 = null;
                                } else {
                                    if (j2 - AudioConstants.TRANSCRIPTION_TIMEOUT_MS <= j || j > AudioConstants.TRANSCRIPTION_TIMEOUT_MS + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    bVar = this.c0;
                                    if (bVar != null || bVar.b > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    id4Var = this.V;
                                    id4Var.getClass();
                                    if (id4Var.N != -1 || (i2 = (id4Var2 = this.V).O) == -1 || i3 == (i2 * id4Var2.N) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.b0 = z5;
                                    if (z3 || z2) {
                                        this.c0 = this.d0;
                                        this.d0 = null;
                                    }
                                }
                            }
                            nn2Var4 = this.X;
                            nn2Var4.getClass();
                            if (nn2Var4.i(4)) {
                                this.O = true;
                                this.X = null;
                                return false;
                            }
                            long j3 = this.S;
                            nn2 nn2Var8 = this.X;
                            nn2Var8.getClass();
                            this.S = Math.max(j3, nn2Var8.y);
                            if (z) {
                                this.X = null;
                            } else {
                                nn2 nn2Var9 = this.X;
                                nn2Var9.getClass();
                                nn2Var9.j();
                            }
                            return !this.b0;
                        }
                        if (iQ != -3) {
                            d43.c();
                            return false;
                        }
                    }
                } else {
                    i = this.T;
                    nn2Var = this.X;
                    if (i == 2) {
                        nn2Var.getClass();
                        this.X.t = 4;
                        lq0 lq0Var4 = this.W;
                        lq0Var4.getClass();
                        lq0Var4.f(this.X);
                        this.X = null;
                        this.T = 3;
                        return false;
                    }
                    iQ = Q(jd4Var, nn2Var, 0);
                    if (iQ != -5) {
                        id4 id4Var4 = jd4Var.b;
                        id4Var4.getClass();
                        this.V = id4Var4;
                        this.f0 = true;
                        this.T = 2;
                        return true;
                    }
                    if (iQ != -4) {
                        this.X.m();
                        byteBuffer = this.X.w;
                        if (byteBuffer != null) {
                            nn2Var2 = this.X;
                            nn2Var2.getClass();
                            if (nn2Var2.i(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            nn2Var2 = this.X;
                            nn2Var2.getClass();
                            if (nn2Var2.i(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            nn2 nn2Var10 = this.X;
                            nn2Var10.getClass();
                            nn2Var10.u = this.V;
                            lq0 lq0Var5 = this.W;
                            lq0Var5.getClass();
                            nn2 nn2Var11 = this.X;
                            nn2Var11.getClass();
                            lq0Var5.f(nn2Var11);
                            this.e0 = 0;
                        }
                        nn2Var3 = this.X;
                        nn2Var3.getClass();
                        if (nn2Var3.i(4)) {
                            this.b0 = true;
                        } else {
                            int i4 = this.e0;
                            j2 = nn2Var3.y;
                            this.d0 = new b(i4, j2);
                            this.e0 = i4 + 1;
                            if (this.b0) {
                                this.c0 = this.d0;
                                this.d0 = null;
                            } else {
                                if (j2 - AudioConstants.TRANSCRIPTION_TIMEOUT_MS <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                bVar = this.c0;
                                if (bVar != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                id4Var = this.V;
                                id4Var.getClass();
                                if (id4Var.N != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.b0 = z5;
                                if (z3) {
                                    this.c0 = this.d0;
                                    this.d0 = null;
                                } else {
                                    this.c0 = this.d0;
                                    this.d0 = null;
                                }
                            }
                        }
                        nn2Var4 = this.X;
                        nn2Var4.getClass();
                        if (nn2Var4.i(4)) {
                            this.O = true;
                            this.X = null;
                            return false;
                        }
                        long j4 = this.S;
                        nn2 nn2Var12 = this.X;
                        nn2Var12.getClass();
                        this.S = Math.max(j4, nn2Var12.y);
                        if (z) {
                            this.X = null;
                        } else {
                            nn2 nn2Var13 = this.X;
                            nn2Var13.getClass();
                            nn2Var13.j();
                        }
                        return !this.b0;
                    }
                    if (iQ != -3) {
                        d43.c();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void T() throws lo3 {
        if (this.f0) {
            id4 id4Var = this.V;
            id4Var.getClass();
            lq0.a aVar = this.L;
            int iA = aVar.a(id4Var);
            if (iA != l.r(4, 0, 0, 0) && iA != l.r(3, 0, 0, 0)) {
                throw G(new t75("Provided decoder factory can't create decoder for format."), this.V, false, 4005);
            }
            lq0 lq0Var = this.W;
            if (lq0Var != null) {
                lq0Var.a();
            }
            this.W = new lq0(aVar.a);
            this.f0 = false;
        }
    }

    public final void U() {
        this.X = null;
        this.T = 0;
        this.S = -9223372036854775807L;
        lq0 lq0Var = this.W;
        if (lq0Var != null) {
            lq0Var.a();
            this.W = null;
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        int i = this.U;
        if (i != 3) {
            return i == 0 && this.b0;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.k
    public final boolean d() {
        return this.P;
    }

    @Override // androidx.media3.exoplayer.l
    public final int f(id4 id4Var) {
        return this.L.a(id4Var);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) throws lo3 {
        if (this.P) {
            return;
        }
        if (this.V == null) {
            jd4 jd4Var = this.v;
            jd4Var.a();
            nn2 nn2Var = this.M;
            nn2Var.j();
            int iQ = Q(jd4Var, nn2Var, 2);
            if (iQ != -5) {
                if (iQ == -4) {
                    xl7.r(nn2Var.i(4));
                    this.O = true;
                    this.P = true;
                    return;
                }
                return;
            }
            id4 id4Var = jd4Var.b;
            id4Var.getClass();
            this.V = id4Var;
            this.f0 = true;
        }
        if (this.W == null) {
            T();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (R(j)) {
            }
            while (S(j)) {
            }
            Trace.endSection();
        } catch (t75 e) {
            throw G(e, null, false, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.j.b
    public final void y(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.Z = (g85) obj;
        } else {
            ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
            if (imageOutput == null) {
                imageOutput = ImageOutput.a;
            }
            this.Y = imageOutput;
        }
    }
}
