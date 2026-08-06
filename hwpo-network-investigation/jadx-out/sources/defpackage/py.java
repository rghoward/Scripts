package defpackage;

import android.view.View;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class py {
    public static final u93 a = new u93(new ky(0));
    public static final float b;
    public static final float c;

    static {
        new k26(new ly());
        new dc2(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    public static final void a(final ox6 ox6Var, final fr1 fr1Var, final wja wjaVar, final wja wjaVar2, final fr1 fr1Var2, final ei4 ei4Var, final float f, final omb ombVar, final kra kraVar, jt1 jt1Var, final int i, final int i2) {
        int i3;
        wja wjaVar3;
        fr1 fr1Var3;
        ei4 ei4Var2;
        omb ombVar2;
        int i4;
        bj4 bj4VarO = jt1Var.o(-2033800111);
        if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bj4VarO.J(wjaVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(null) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            wjaVar3 = wjaVar2;
            i3 |= bj4VarO.J(wjaVar3) ? 16384 : 8192;
        } else {
            wjaVar3 = wjaVar2;
        }
        if ((196608 & i) == 0) {
            i3 |= bj4VarO.J(di.a.m) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            fr1Var3 = fr1Var2;
            i3 |= bj4VarO.j(fr1Var3) ? 1048576 : 524288;
        } else {
            fr1Var3 = fr1Var2;
        }
        if ((12582912 & i) == 0) {
            ei4Var2 = ei4Var;
            i3 |= bj4VarO.j(ei4Var2) ? 8388608 : 4194304;
        } else {
            ei4Var2 = ei4Var;
        }
        if ((100663296 & i) == 0) {
            i3 |= bj4VarO.g(f) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            ombVar2 = ombVar;
            i3 |= bj4VarO.J(ombVar2) ? 536870912 : 268435456;
        } else {
            ombVar2 = ombVar;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bj4VarO.J(kraVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.J(null) ? 32 : 16;
        }
        if (bj4VarO.A(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((iq9) bj4VarO.F(a)).a(new jq9(ox6Var, fr1Var, wjaVar, wjaVar3, fr1Var3, ei4Var2, f, ombVar2, kraVar), bj4VarO, 0);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: my
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    py.a(ox6Var, fr1Var, wjaVar, wjaVar2, fr1Var2, ei4Var, f, ombVar, kraVar, (jt1) obj, gz3.s(i | 1), gz3.s(i2));
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final fr1 fr1Var, final ox6 ox6Var, final fr1 fr1Var2, ei4 ei4Var, float f, omb ombVar, final kra kraVar, jt1 jt1Var, final int i) {
        final ei4 ei4Var2;
        final float f2;
        final omb ombVar2;
        int i2;
        float f3;
        omb y76Var;
        ei4 ei4Var3;
        bj4 bj4VarO = jt1Var.o(1784421840);
        int i3 = i | (bj4VarO.J(ox6Var) ? 32 : 16) | 93184 | (bj4VarO.J(kraVar) ? 1048576 : 524288) | 12582912;
        if (bj4VarO.A(i3 & 1, (4793491 & i3) != 4793490)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                fr1 fr1Var3 = jr1.a;
                WeakHashMap<View, fnb> weakHashMap = fnb.w;
                i2 = i3 & (-458753);
                f3 = 64.0f;
                y76Var = new y76(new d2b(fnb.a.c(bj4VarO).g, fnb.a.c(bj4VarO).b), 16 | 15);
                ei4Var3 = fr1Var3;
            } else {
                bj4VarO.u();
                ei4Var3 = ei4Var;
                y76Var = ombVar;
                i2 = i3 & (-458753);
                f3 = f;
            }
            bj4VarO.V();
            wja wjaVarA = j0b.a(sy.a, bj4VarO);
            float f4 = 64.0f;
            wja wjaVar = wja.d;
            if (!y43.e(f3, Float.NaN) && !y43.e(f3, Float.POSITIVE_INFINITY)) {
                f4 = f3;
            }
            a(ox6Var, fr1Var, wjaVarA, wjaVar, fr1Var2, ei4Var3, f4, y76Var, kraVar, bj4VarO, 14380080 | ((i2 >> 3) & 14), (i2 >> 18) & 126);
            f2 = f3;
            ei4Var2 = ei4Var3;
            ombVar2 = y76Var;
        } else {
            bj4VarO.u();
            ei4Var2 = ei4Var;
            f2 = f;
            ombVar2 = ombVar;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, fr1Var2, ei4Var2, f2, ombVar2, kraVar, i) { // from class: jy
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ fr1 v;
                public final /* synthetic */ ei4 w;
                public final /* synthetic */ float x;
                public final /* synthetic */ omb y;
                public final /* synthetic */ kra z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(391);
                    py.b(this.t, this.u, this.v, this.w, this.x, this.y, this.z, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(final ox6 ox6Var, final v44 v44Var, final long j, final long j2, final long j3, long j4, final ci4 ci4Var, final wja wjaVar, final wja wjaVar2, mh4 mh4Var, final di.b bVar, final ci4 ci4Var2, fr1 fr1Var, final float f, jt1 jt1Var, final int i) {
        mh4 mh4Var2;
        fr1 fr1Var2;
        bj4 bj4Var;
        final long j5 = j4;
        bj4 bj4VarO = jt1Var.o(126395868);
        j1b j1bVar = bj4VarO.a;
        int i2 = i | (bj4VarO.J(ox6Var) ? 4 : 2) | (bj4VarO.J(v44Var) ? 32 : 16) | (bj4VarO.i(j) ? 256 : 128) | (bj4VarO.i(j2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.i(j3) ? 16384 : 8192) | (bj4VarO.i(j5) ? 131072 : 65536) | (bj4VarO.j(ci4Var) ? 1048576 : 524288) | (bj4VarO.J(wjaVar) ? 8388608 : 4194304) | (bj4VarO.j(null) ? 67108864 : 33554432) | (bj4VarO.J(wjaVar2) ? 536870912 : 268435456);
        int i3 = 1600566 | (bj4VarO.J(bVar) ? 256 : 128) | (bj4VarO.j(ci4Var2) ? 131072 : 65536) | (bj4VarO.g(f) ? 8388608 : 4194304);
        if (bj4VarO.A(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z || objF == c0187a) {
                objF = new mra(v44Var, bVar, f);
                bj4VarO.C(objF);
            }
            mra mraVar = (mra) objF;
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, mraVar);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            bt1.a.b bVar2 = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar2);
            }
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarD = yq5.d(aVar2, "navigationIcon");
            float f2 = b;
            ox6 ox6VarM = eo7.m(ox6VarD, f2, 0.0f, 0.0f, 0.0f, 14);
            sp0 sp0Var = di.a.a;
            fl6 fl6VarD = dv0.d(sp0Var, false);
            int iD2 = bj4VarO.D();
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarM);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD2))) {
                qh.a(iD2, bj4VarO, iD2, bVar2);
            }
            rd7.d(bj4VarO, dVar, ox6VarC2);
            u93 u93Var = zy1.a;
            nu1.a(u93Var.a(new uh1(j)), ci4Var2, bj4VarO, ((i3 >> 12) & 112) | 8);
            bj4VarO.U(true);
            bj4VarO.K(-1359701523);
            ox6 ox6VarK = eo7.k(yq5.d(aVar2, "title"), f2, 0.0f, 2);
            bj4VarO.K(510340109);
            bj4VarO.U(false);
            ox6 ox6VarH = ox6VarK.H(aVar2);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                mh4Var2 = mh4Var;
                objF2 = new ny(mh4Var2, 0);
                bj4VarO.C(objF2);
            } else {
                mh4Var2 = mh4Var;
            }
            ox6 ox6VarA = po4.a(ox6VarH, (oh4) objF2);
            fl6 fl6VarD2 = dv0.d(sp0Var, false);
            int iD3 = bj4VarO.D();
            kw7 kw7VarP3 = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, ox6VarA);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD2);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD3))) {
                qh.a(iD3, bj4VarO, iD3, bVar2);
            }
            rd7.d(bj4VarO, dVar, ox6VarC3);
            bzb.b(j2, wjaVar, ci4Var, bj4VarO, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            bj4Var = bj4VarO;
            bj4Var.U(true);
            bj4Var.U(false);
            ox6 ox6VarM2 = eo7.m(yq5.d(aVar2, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            fl6 fl6VarD3 = dv0.d(sp0Var, false);
            int iD4 = bj4Var.D();
            kw7 kw7VarP4 = bj4Var.P();
            ox6 ox6VarC4 = it1.c(bj4Var, ox6VarM2);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                bj4Var.k(aVar);
            } else {
                bj4Var.z();
            }
            rd7.d(bj4Var, cVar, fl6VarD3);
            rd7.d(bj4Var, eVar, kw7VarP4);
            if (bj4Var.S || !xj5.a(bj4Var.f(), Integer.valueOf(iD4))) {
                qh.a(iD4, bj4Var, iD4, bVar2);
            }
            rd7.d(bj4Var, dVar, ox6VarC4);
            j5 = j4;
            fr1Var2 = fr1Var;
            nu1.a(u93Var.a(new uh1(j5)), fr1Var2, bj4Var, 56);
            bj4Var.U(true);
            bj4Var.U(true);
        } else {
            mh4Var2 = mh4Var;
            fr1Var2 = fr1Var;
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final fr1 fr1Var3 = fr1Var2;
            final mh4 mh4Var3 = mh4Var2;
            xj8VarW.d = new ci4(v44Var, j, j2, j3, j5, ci4Var, wjaVar, wjaVar2, mh4Var3, bVar, ci4Var2, fr1Var3, f, i) { // from class: oy
                public final /* synthetic */ wja A;
                public final /* synthetic */ wja B;
                public final /* synthetic */ mh4 C;
                public final /* synthetic */ di.b D;
                public final /* synthetic */ ci4 E;
                public final /* synthetic */ fr1 F;
                public final /* synthetic */ float G;
                public final /* synthetic */ v44 u;
                public final /* synthetic */ long v;
                public final /* synthetic */ long w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;
                public final /* synthetic */ ci4 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    py.c(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
