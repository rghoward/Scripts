package defpackage;

import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gz5 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ gz5(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        boolean z;
        lx5.b bVar;
        lx5.b bVar2;
        lx5.b bVar3;
        lx5.b bVar4;
        xy5 xy5Var;
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                nz5 nz5Var = (nz5) obj2;
                lz5 lz5Var = nz5Var.r;
                zr2 zr2Var = nz5Var.a;
                boolean z2 = nz5Var.k;
                float f = -((Float) obj).floatValue();
                if ((f >= 0.0f || nz5Var.d()) && (f <= 0.0f || nz5Var.b())) {
                    if (Math.abs(nz5Var.h) > 0.5f) {
                        xc5.c("entered drag with non-zero pending scroll");
                    }
                    nz5Var.d = true;
                    float f2 = nz5Var.h + f;
                    nz5Var.h = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = nz5Var.h;
                        int iRound = Math.round(f3);
                        xy5 xy5VarO = ((xy5) nz5Var.f.getValue()).o(iRound, !nz5Var.b);
                        if (xy5VarO != null && (xy5Var = nz5Var.c) != null) {
                            xy5 xy5VarO2 = xy5Var.o(iRound, true);
                            if (xy5VarO2 != null) {
                                nz5Var.c = xy5VarO2;
                            } else {
                                xy5VarO = null;
                            }
                        }
                        if (xy5VarO != null) {
                            nz5Var.g(xy5VarO, nz5Var.b, true);
                            f18.b(nz5Var.w);
                            float f4 = f3 - nz5Var.h;
                            if (z2) {
                                zr2Var.getClass();
                                if (!xy5VarO.g().isEmpty()) {
                                    z = f4 < 0.0f;
                                    int iA = zr2.a(xy5VarO, z);
                                    if (iA >= 0 && iA < xy5VarO.e()) {
                                        if (iA != zr2Var.a) {
                                            if (zr2Var.c != z) {
                                                zr2Var.a = -1;
                                                lx5.b bVar5 = zr2Var.b;
                                                if (bVar5 != null) {
                                                    bVar5.cancel();
                                                }
                                                zr2Var.b = null;
                                            }
                                            zr2Var.c = z;
                                            zr2Var.a = iA;
                                            zr2Var.b = lz5Var.a(iA);
                                        }
                                        if (z) {
                                            hy5 hy5Var = (hy5) th1.G(xy5VarO.g());
                                            if (((hy5Var.getSize() + hy5Var.getOffset()) + xy5VarO.f()) - xy5VarO.i() < (-f4) && (bVar4 = zr2Var.b) != null) {
                                                bVar4.c();
                                            }
                                        } else if (xy5VarO.k() - ((hy5) th1.y(xy5VarO.g())).getOffset() < f4 && (bVar3 = zr2Var.b) != null) {
                                            bVar3.c();
                                        }
                                    }
                                }
                                zr2Var.e = f4;
                            }
                        } else {
                            fm8 fm8Var = nz5Var.l;
                            if (fm8Var != null) {
                                fm8Var.i();
                            }
                            float f5 = f3 - nz5Var.h;
                            ty5 ty5VarJ = nz5Var.j();
                            if (z2) {
                                zr2Var.getClass();
                                if (!ty5VarJ.g().isEmpty()) {
                                    z = f5 < 0.0f;
                                    int iA2 = zr2.a(ty5VarJ, z);
                                    if (iA2 >= 0 && iA2 < ty5VarJ.e()) {
                                        if (iA2 != zr2Var.a) {
                                            if (zr2Var.c != z) {
                                                zr2Var.a = -1;
                                                lx5.b bVar6 = zr2Var.b;
                                                if (bVar6 != null) {
                                                    bVar6.cancel();
                                                }
                                                zr2Var.b = null;
                                            }
                                            zr2Var.c = z;
                                            zr2Var.a = iA2;
                                            zr2Var.b = lz5Var.a(iA2);
                                        }
                                        if (z) {
                                            hy5 hy5Var2 = (hy5) th1.G(ty5VarJ.g());
                                            if (((hy5Var2.getSize() + hy5Var2.getOffset()) + ty5VarJ.f()) - ty5VarJ.i() < (-f5) && (bVar2 = zr2Var.b) != null) {
                                                bVar2.c();
                                            }
                                        } else if (ty5VarJ.k() - ((hy5) th1.y(ty5VarJ.g())).getOffset() < f5 && (bVar = zr2Var.b) != null) {
                                            bVar.c();
                                        }
                                    }
                                }
                                zr2Var.e = f5;
                            }
                        }
                    }
                    if (Math.abs(nz5Var.h) > 0.5f) {
                        f -= nz5Var.h;
                        nz5Var.h = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            default:
                ya yaVar = (ya) obj;
                yaVar.getClass();
                LinearLayout linearLayout = ((ma6) yaVar.u).a;
                linearLayout.getClass();
                xgb.a(linearLayout, new ar8((mj7.b) obj2, yaVar, null));
                yaVar.s(new jl7(1, yaVar));
                return g2b.a;
        }
    }
}
