package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class av6 extends a implements Handler.Callback {
    public final wu6.a L;
    public final d.b M;
    public final Handler N;
    public final xu6 O;
    public ln4 P;
    public boolean Q;
    public boolean R;
    public long S;
    public su6 T;
    public long U;

    public av6(d.b bVar, Looper looper) {
        super(5);
        this.M = bVar;
        this.N = looper == null ? null : new Handler(looper, this);
        this.L = wu6.a;
        this.O = new xu6(1);
        this.U = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.a
    public final void H() {
        this.T = null;
        this.P = null;
        this.U = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.a
    public final void J(long j, boolean z, boolean z2) {
        this.T = null;
        this.Q = false;
        this.R = false;
    }

    @Override // androidx.media3.exoplayer.a
    public final void O(id4[] id4VarArr, long j, long j2, bq6.b bVar) {
        this.P = this.L.a(id4VarArr[0]);
        su6 su6Var = this.T;
        if (su6Var != null) {
            long j3 = su6Var.b;
            long j4 = (this.U + j3) - j2;
            if (j3 != j4) {
                su6Var = new su6(j4, su6Var.a);
            }
            this.T = su6Var;
        }
        this.U = j2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void R(su6 su6Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            su6.a[] aVarArr = su6Var.a;
            if (i >= aVarArr.length) {
                return;
            }
            id4 id4VarA = aVarArr[i].a();
            if (id4VarA != null) {
                wu6.a aVar = this.L;
                if (aVar.b(id4VarA)) {
                    ln4 ln4VarA = aVar.a(id4VarA);
                    byte[] bArrC = aVarArr[i].c();
                    bArrC.getClass();
                    xu6 xu6Var = this.O;
                    xu6Var.j();
                    xu6Var.l(bArrC.length);
                    ByteBuffer byteBuffer = xu6Var.w;
                    String str = n6b.a;
                    byteBuffer.put(bArrC);
                    xu6Var.m();
                    su6 su6VarB0 = ln4VarA.B0(xu6Var);
                    if (su6VarB0 != null) {
                        R(su6VarB0, arrayList);
                    }
                } else {
                    arrayList.add(aVarArr[i]);
                }
            } else {
                arrayList.add(aVarArr[i]);
            }
            i++;
        }
    }

    public final long S(long j) {
        xl7.r(j != -9223372036854775807L);
        xl7.r(this.U != -9223372036854775807L);
        return j - this.U;
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.k
    public final boolean d() {
        return this.R;
    }

    @Override // androidx.media3.exoplayer.l
    public final int f(id4 id4Var) {
        if (this.L.b(id4Var)) {
            return l.r(id4Var.P == 0 ? 4 : 2, 0, 0, 0);
        }
        return l.r(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) {
        boolean z = true;
        while (z) {
            int i = 0;
            if (!this.Q && this.T == null) {
                xu6 xu6Var = this.O;
                xu6Var.j();
                jd4 jd4Var = this.v;
                jd4Var.a();
                int iQ = Q(jd4Var, xu6Var, 0);
                if (iQ == -4) {
                    if (xu6Var.i(4)) {
                        this.Q = true;
                    } else if (xu6Var.y >= this.E) {
                        xu6Var.B = this.S;
                        xu6Var.m();
                        ln4 ln4Var = this.P;
                        String str = n6b.a;
                        su6 su6VarB0 = ln4Var.B0(xu6Var);
                        if (su6VarB0 != null) {
                            ArrayList arrayList = new ArrayList(su6VarB0.a.length);
                            R(su6VarB0, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.T = new su6(S(xu6Var.y), (su6.a[]) arrayList.toArray(new su6.a[0]));
                            }
                        }
                    }
                } else if (iQ == -5) {
                    id4 id4Var = jd4Var.b;
                    id4Var.getClass();
                    this.S = id4Var.t;
                }
            }
            su6 su6Var = this.T;
            if (su6Var == null || su6Var.b > S(j)) {
                z = false;
            } else {
                su6 su6Var2 = this.T;
                Handler handler = this.N;
                if (handler != null) {
                    handler.obtainMessage(1, su6Var2).sendToTarget();
                } else {
                    d.b bVar = this.M;
                    d dVar = d.this;
                    gb6<s28.c> gb6Var = dVar.m;
                    np6.a aVarA = dVar.n0.a();
                    while (true) {
                        su6.a[] aVarArr = su6Var2.a;
                        if (i >= aVarArr.length) {
                            break;
                        }
                        aVarArr[i].b(aVarA);
                        i++;
                    }
                    dVar.n0 = new np6(aVarA);
                    np6 np6VarI0 = dVar.i0();
                    if (!np6VarI0.equals(dVar.T)) {
                        dVar.T = np6VarI0;
                        gb6Var.c(14, new rp3(bVar));
                    }
                    gb6Var.c(28, new sp3(su6Var2));
                    gb6Var.b();
                }
                this.T = null;
                z = true;
            }
            if (this.Q && this.T == null) {
                this.R = true;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = 0;
        if (message.what != 1) {
            d43.c();
            return false;
        }
        su6 su6Var = (su6) message.obj;
        d.b bVar = this.M;
        d dVar = d.this;
        gb6<s28.c> gb6Var = dVar.m;
        np6.a aVarA = dVar.n0.a();
        while (true) {
            su6.a[] aVarArr = su6Var.a;
            if (i >= aVarArr.length) {
                break;
            }
            aVarArr[i].b(aVarA);
            i++;
        }
        dVar.n0 = new np6(aVarA);
        np6 np6VarI0 = dVar.i0();
        if (!np6VarI0.equals(dVar.T)) {
            dVar.T = np6VarI0;
            gb6Var.c(14, new rp3(bVar));
        }
        gb6Var.c(28, new sp3(su6Var));
        gb6Var.b();
        return true;
    }
}
