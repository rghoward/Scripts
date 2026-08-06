package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oja extends a implements Handler.Callback {
    public final gc2 L;
    public final nn2 M;
    public lc2 N;
    public final u4a O;
    public boolean P;
    public int Q;
    public s4a R;
    public v4a S;
    public w4a T;
    public w4a U;
    public int V;
    public final Handler W;
    public final d.b X;
    public final jd4 Y;
    public boolean Z;
    public boolean a0;
    public id4 b0;
    public long c0;
    public long d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oja(d.b bVar, Looper looper) {
        super(3);
        u4a.a aVar = u4a.a;
        this.X = bVar;
        this.W = looper == null ? null : new Handler(looper, this);
        this.O = aVar;
        this.L = new gc2();
        this.M = new nn2(1);
        this.Y = new jd4();
        this.d0 = -9223372036854775807L;
        this.c0 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.a
    public final void H() {
        this.b0 = null;
        this.d0 = -9223372036854775807L;
        ul8 ul8Var = ul8.x;
        T(this.c0);
        kc2 kc2Var = new kc2(ul8Var);
        Handler handler = this.W;
        if (handler != null) {
            handler.obtainMessage(1, kc2Var).sendToTarget();
        } else {
            d.b bVar = this.X;
            d.this.m.e(27, new tp3(kc2Var.a));
            d dVar = d.this;
            dVar.e0 = kc2Var;
            dVar.m.e(27, new qp3(kc2Var));
        }
        this.c0 = -9223372036854775807L;
        if (this.R != null) {
            V();
            s4a s4aVar = this.R;
            s4aVar.getClass();
            s4aVar.a();
            this.R = null;
            this.Q = 0;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void J(long j, boolean z, boolean z2) {
        this.c0 = j;
        lc2 lc2Var = this.N;
        if (lc2Var != null) {
            lc2Var.clear();
        }
        ul8 ul8Var = ul8.x;
        T(this.c0);
        kc2 kc2Var = new kc2(ul8Var);
        Handler handler = this.W;
        if (handler != null) {
            handler.obtainMessage(1, kc2Var).sendToTarget();
        } else {
            d.b bVar = this.X;
            d.this.m.e(27, new tp3(kc2Var.a));
            d dVar = d.this;
            dVar.e0 = kc2Var;
            dVar.m.e(27, new qp3(kc2Var));
        }
        this.Z = false;
        this.a0 = false;
        this.d0 = -9223372036854775807L;
        id4 id4Var = this.b0;
        if (id4Var == null || Objects.equals(id4Var.o, "application/x-media3-cues")) {
            return;
        }
        if (this.Q == 0) {
            V();
            s4a s4aVar = this.R;
            s4aVar.getClass();
            s4aVar.flush();
            s4aVar.b(this.E);
            return;
        }
        V();
        s4a s4aVar2 = this.R;
        s4aVar2.getClass();
        s4aVar2.a();
        this.R = null;
        this.Q = 0;
        U();
    }

    @Override // androidx.media3.exoplayer.a
    public final void O(id4[] id4VarArr, long j, long j2, bq6.b bVar) {
        id4 id4Var = id4VarArr[0];
        this.b0 = id4Var;
        if (Objects.equals(id4Var.o, "application/x-media3-cues")) {
            this.N = this.b0.M == 1 ? new ks6() : new h60();
            return;
        }
        R();
        if (this.R != null) {
            this.Q = 1;
        } else {
            U();
        }
    }

    public final void R() {
        boolean z = Objects.equals(this.b0.o, "application/cea-608") || Objects.equals(this.b0.o, "application/x-mp4-cea-608") || Objects.equals(this.b0.o, "application/cea-708");
        String str = this.b0.o;
        if (z) {
            return;
        }
        aa0.c(p2a.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long S() {
        if (this.V == -1) {
            return Long.MAX_VALUE;
        }
        this.T.getClass();
        if (this.V >= this.T.g()) {
            return Long.MAX_VALUE;
        }
        return this.T.e(this.V);
    }

    public final long T(long j) {
        xl7.r(j != -9223372036854775807L);
        return j - this.D;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    public final void U() {
        s4a ww2Var;
        byte b = 1;
        this.P = true;
        id4 id4Var = this.b0;
        id4Var.getClass();
        zt2 zt2Var = ((u4a.a) this.O).b;
        String str = id4Var.o;
        int i = id4Var.L;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    ww2Var = new s51(str, i);
                    break;
                case 2:
                    ww2Var = new u51(i, id4Var.r);
                    break;
                default:
                    if (zt2Var.f(id4Var)) {
                        z90.a(ct1.a("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    z4a z4aVarG = zt2Var.g(id4Var);
                    z4aVarG.getClass().getSimpleName().concat("Decoder");
                    ww2Var = new ww2(z4aVarG);
                    break;
                    break;
            }
        } else if (zt2Var.f(id4Var)) {
            z90.a(ct1.a("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            z4a z4aVarG2 = zt2Var.g(id4Var);
            z4aVarG2.getClass().getSimpleName().concat("Decoder");
            ww2Var = new ww2(z4aVarG2);
        }
        this.R = ww2Var;
        ww2Var.b(this.E);
    }

    public final void V() {
        this.S = null;
        this.V = -1;
        w4a w4aVar = this.T;
        if (w4aVar != null) {
            w4aVar.k();
            this.T = null;
        }
        w4a w4aVar2 = this.U;
        if (w4aVar2 != null) {
            w4aVar2.k();
            this.U = null;
        }
    }

    @Override // androidx.media3.exoplayer.k
    public final boolean b() {
        id4 id4Var = this.b0;
        if (id4Var != null) {
            if (!Objects.equals(id4Var.o, "application/x-media3-cues")) {
                if (!this.a0) {
                    if (this.Z) {
                        w4a w4aVar = this.T;
                        long j = this.c0;
                        if (w4aVar == null || w4aVar.g() <= 0 || w4aVar.e(w4aVar.g() - 1) <= j) {
                            w4a w4aVar2 = this.U;
                            long j2 = this.c0;
                            if ((w4aVar2 == null || w4aVar2.g() <= 0 || w4aVar2.e(w4aVar2.g() - 1) <= j2) && this.S != null) {
                            }
                        }
                    }
                }
                return false;
            }
            lc2 lc2Var = this.N;
            lc2Var.getClass();
            if (lc2Var.a(this.c0) == Long.MIN_VALUE) {
                try {
                    A();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.a, androidx.media3.exoplayer.k
    public final boolean d() {
        return this.a0;
    }

    @Override // androidx.media3.exoplayer.l
    public final int f(id4 id4Var) {
        boolean zEquals = Objects.equals(id4Var.o, "application/x-media3-cues");
        String str = id4Var.o;
        if (!zEquals) {
            u4a.a aVar = (u4a.a) this.O;
            aVar.getClass();
            if (!aVar.b.f(id4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return fv6.l(str) ? l.r(1, 0, 0, 0) : l.r(0, 0, 0, 0);
            }
        }
        return l.r(id4Var.P == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.k, androidx.media3.exoplayer.l
    public final String getName() {
        return "TextRenderer";
    }

    @Override // androidx.media3.exoplayer.k
    public final void h(long j, long j2) {
        boolean z;
        jd4 jd4Var;
        boolean z2;
        long jE;
        if (this.G) {
            long j3 = this.d0;
            if (j3 != -9223372036854775807L && j >= j3) {
                V();
                this.a0 = true;
            }
        }
        if (this.a0) {
            return;
        }
        id4 id4Var = this.b0;
        id4Var.getClass();
        boolean zEquals = Objects.equals(id4Var.o, "application/x-media3-cues");
        d.b bVar = this.X;
        Handler handler = this.W;
        int i = 4;
        jd4 jd4Var2 = this.Y;
        boolean zB = false;
        zB = false;
        zB = false;
        if (zEquals) {
            this.N.getClass();
            if (!this.Z) {
                nn2 nn2Var = this.M;
                if (Q(jd4Var2, nn2Var, 0) == -4) {
                    if (nn2Var.i(4)) {
                        this.Z = true;
                    } else {
                        nn2Var.m();
                        ByteBuffer byteBuffer = nn2Var.w;
                        byteBuffer.getClass();
                        long j4 = nn2Var.y;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.L.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        fc2 fc2Var = new fc2();
                        k95.b bVar2 = k95.u;
                        k95.a aVar = new k95.a();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                            bundle2.getClass();
                            aVar.c(fc2Var.apply(bundle2));
                        }
                        mc2 mc2Var = new mc2(j4, bundle.getLong("d"), aVar.g());
                        nn2Var.j();
                        zB = this.N.b(mc2Var, j);
                    }
                }
            }
            long jA = this.N.a(this.c0);
            if (jA == Long.MIN_VALUE && this.Z && !zB) {
                this.a0 = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zB = true;
            }
            if (zB) {
                k95<ec2> k95VarC = this.N.c(j);
                long jD = this.N.d(j);
                T(jD);
                kc2 kc2Var = new kc2(k95VarC);
                if (handler != null) {
                    handler.obtainMessage(1, kc2Var).sendToTarget();
                } else {
                    d.this.m.e(27, new tp3(kc2Var.a));
                    d dVar = d.this;
                    dVar.e0 = kc2Var;
                    dVar.m.e(27, new qp3(kc2Var));
                }
                this.N.e(jD);
            }
            this.c0 = j;
            return;
        }
        R();
        this.c0 = j;
        if (this.U == null) {
            s4a s4aVar = this.R;
            s4aVar.getClass();
            s4aVar.c(j);
            try {
                s4a s4aVar2 = this.R;
                s4aVar2.getClass();
                this.U = s4aVar2.d();
            } catch (t4a e) {
                md6.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.b0, e);
                ul8 ul8Var = ul8.x;
                T(this.c0);
                kc2 kc2Var2 = new kc2(ul8Var);
                if (handler != null) {
                    handler.obtainMessage(1, kc2Var2).sendToTarget();
                } else {
                    d.this.m.e(27, new tp3(kc2Var2.a));
                    d dVar2 = d.this;
                    dVar2.e0 = kc2Var2;
                    dVar2.m.e(27, new qp3(kc2Var2));
                }
                V();
                s4a s4aVar3 = this.R;
                s4aVar3.getClass();
                s4aVar3.a();
                this.R = null;
                this.Q = 0;
                U();
                return;
            }
        }
        if (this.A != 2) {
            return;
        }
        if (this.T != null) {
            long jS = S();
            z = false;
            while (jS <= j) {
                this.V++;
                jS = S();
                z = true;
            }
        } else {
            z = false;
        }
        w4a w4aVar = this.U;
        if (w4aVar == null) {
            jd4Var = jd4Var2;
            z2 = z;
        } else if (w4aVar.i(4)) {
            if (!z && S() == Long.MAX_VALUE) {
                if (this.Q == 2) {
                    V();
                    s4a s4aVar4 = this.R;
                    s4aVar4.getClass();
                    s4aVar4.a();
                    this.R = null;
                    this.Q = 0;
                    U();
                } else {
                    V();
                    this.a0 = true;
                }
            }
            jd4Var = jd4Var2;
            z2 = z;
        } else {
            jd4Var = jd4Var2;
            if (w4aVar.u <= j) {
                w4a w4aVar2 = this.T;
                if (w4aVar2 != null) {
                    z2 = z;
                    w4aVar2.k();
                }
                z2 = z;
                this.V = w4aVar.a(j);
                this.T = w4aVar;
                this.U = null;
                z2 = true;
            }
        }
        if (z2) {
            this.T.getClass();
            int iA = this.T.a(j);
            if (iA == 0 || this.T.g() == 0) {
                jE = this.T.u;
            } else {
                w4a w4aVar3 = this.T;
                jE = iA == -1 ? w4aVar3.e(w4aVar3.g() - 1) : w4aVar3.e(iA - 1);
            }
            T(jE);
            kc2 kc2Var3 = new kc2(this.T.f(j));
            if (handler != null) {
                handler.obtainMessage(1, kc2Var3).sendToTarget();
            } else {
                d.this.m.e(27, new tp3(kc2Var3.a));
                d dVar3 = d.this;
                dVar3.e0 = kc2Var3;
                dVar3.m.e(27, new qp3(kc2Var3));
            }
        }
        if (this.Q == 2) {
            return;
        }
        while (!this.Z) {
            try {
                v4a v4aVarE = this.S;
                if (v4aVarE == null) {
                    s4a s4aVar5 = this.R;
                    s4aVar5.getClass();
                    v4aVarE = s4aVar5.e();
                    if (v4aVarE == null) {
                        return;
                    } else {
                        this.S = v4aVarE;
                    }
                }
                if (this.Q == 1) {
                    v4aVarE.t = i;
                    s4a s4aVar6 = this.R;
                    s4aVar6.getClass();
                    s4aVar6.f(v4aVarE);
                    this.S = null;
                    this.Q = 2;
                    return;
                }
                jd4 jd4Var3 = jd4Var;
                int iQ = Q(jd4Var3, v4aVarE, 0);
                if (iQ == -4) {
                    if (v4aVarE.i(i)) {
                        this.Z = true;
                        this.P = false;
                    } else {
                        id4 id4Var2 = jd4Var3.b;
                        if (id4Var2 == null) {
                            return;
                        }
                        v4aVarE.B = id4Var2.t;
                        v4aVarE.m();
                        this.P &= !v4aVarE.i(1);
                    }
                    if (!this.P) {
                        s4a s4aVar7 = this.R;
                        s4aVar7.getClass();
                        s4aVar7.f(v4aVarE);
                        this.S = null;
                    }
                } else if (iQ == -3) {
                    return;
                }
                jd4Var = jd4Var3;
                i = 4;
            } catch (t4a e2) {
                md6.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.b0, e2);
                ul8 ul8Var2 = ul8.x;
                T(this.c0);
                kc2 kc2Var4 = new kc2(ul8Var2);
                if (handler != null) {
                    handler.obtainMessage(1, kc2Var4).sendToTarget();
                } else {
                    d.this.m.e(27, new tp3(kc2Var4.a));
                    d dVar4 = d.this;
                    dVar4.e0 = kc2Var4;
                    dVar4.m.e(27, new qp3(kc2Var4));
                }
                V();
                s4a s4aVar8 = this.R;
                s4aVar8.getClass();
                s4aVar8.a();
                this.R = null;
                this.Q = 0;
                U();
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            d43.c();
            return false;
        }
        kc2 kc2Var = (kc2) message.obj;
        ul8 ul8Var = kc2Var.a;
        d.b bVar = this.X;
        d.this.m.e(27, new tp3(ul8Var));
        d dVar = d.this;
        dVar.e0 = kc2Var;
        dVar.m.e(27, new qp3(kc2Var));
        return true;
    }
}
