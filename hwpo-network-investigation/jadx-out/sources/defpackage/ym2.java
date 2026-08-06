package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ym2 implements s02 {
    public static final /* synthetic */ int t = 0;

    public static final ox6 b(ox6 ox6Var, p94 p94Var) {
        return ox6Var.H(new q94(p94Var));
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String d(r02 r02Var) {
        Object aVar;
        if (r02Var instanceof a23) {
            return ((a23) r02Var).toString();
        }
        try {
            aVar = r02Var + '@' + c(r02Var);
        } catch (Throwable th) {
            aVar = new av8.a(th);
        }
        if (av8.a(aVar) != null) {
            aVar = r02Var.getClass().getName() + '@' + c(r02Var);
        }
        return (String) aVar;
    }

    @Override // defpackage.s02
    public Object a(r9a r9aVar) {
        u1c u1cVarJ;
        gnc gncVar = (gnc) r9aVar.j();
        ftc ftcVarD = htc.D();
        String str = gncVar.t;
        ftcVarD.h();
        ((htc) ftcVarD.u).E(str);
        String str2 = gncVar.v;
        ftcVarD.h();
        ((htc) ftcVarD.u).G(str2);
        boolean z = gncVar.y;
        ftcVarD.h();
        ((htc) ftcVarD.u).J(z);
        long j = gncVar.z;
        ftcVarD.h();
        ((htc) ftcVarD.u).K(j);
        byte[] bArr = gncVar.u;
        if (bArr != null) {
            o0c o0cVarN = p0c.n(bArr, 0, bArr.length);
            ftcVarD.h();
            ((htc) ftcVarD.u).F(o0cVarN);
        }
        for (dnc dncVar : gncVar.w) {
            for (rnc rncVar : dncVar.u) {
                int i = rncVar.z;
                String str3 = rncVar.t;
                if (i == 1) {
                    itc itcVarD = ktc.D();
                    itcVarD.n(str3);
                    if (i != 1) {
                        z90.a("Not a long type");
                        return null;
                    }
                    long j2 = rncVar.u;
                    itcVarD.h();
                    ((ktc) itcVarD.u).G(j2);
                    u1cVarJ = itcVarD.j();
                } else if (i == 2) {
                    itc itcVarD2 = ktc.D();
                    itcVarD2.n(str3);
                    if (i != 2) {
                        z90.a("Not a boolean type");
                        return null;
                    }
                    boolean z2 = rncVar.v;
                    itcVarD2.h();
                    ((ktc) itcVarD2.u).H(z2);
                    u1cVarJ = itcVarD2.j();
                } else if (i == 3) {
                    itc itcVarD3 = ktc.D();
                    itcVarD3.n(str3);
                    if (i != 3) {
                        z90.a("Not a double type");
                        return null;
                    }
                    double d = rncVar.w;
                    itcVarD3.h();
                    ((ktc) itcVarD3.u).I(d);
                    u1cVarJ = itcVarD3.j();
                } else if (i == 4) {
                    itc itcVarD4 = ktc.D();
                    itcVarD4.n(str3);
                    if (i != 4) {
                        z90.a("Not a String type");
                        return null;
                    }
                    String str4 = rncVar.x;
                    a78.g(str4);
                    itcVarD4.h();
                    ((ktc) itcVarD4.u).J(str4);
                    u1cVarJ = itcVarD4.j();
                } else {
                    if (i != 5) {
                        z90.a(d43.a(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                        return null;
                    }
                    itc itcVarD5 = ktc.D();
                    itcVarD5.n(str3);
                    if (i != 5) {
                        z90.a("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = rncVar.y;
                    a78.g(bArr2);
                    o0c o0cVarN2 = p0c.n(bArr2, 0, bArr2.length);
                    itcVarD5.h();
                    ((ktc) itcVarD5.u).K(o0cVarN2);
                    u1cVarJ = itcVarD5.j();
                }
                ftcVarD.h();
                ((htc) ftcVarD.u).H((ktc) u1cVarJ);
            }
            String[] strArr = dncVar.v;
            if (strArr != null) {
                for (String str5 : strArr) {
                    ftcVarD.h();
                    ((htc) ftcVarD.u).I(str5);
                }
            }
        }
        return (htc) ftcVarD.j();
    }
}
