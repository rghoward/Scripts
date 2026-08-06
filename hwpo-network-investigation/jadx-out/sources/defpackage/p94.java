package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p94 {
    public static final p94 b = new p94();
    public static final p94 c = new p94();
    public static final p94 d = new p94();
    public final k37<s94> a = new k37<>(new s94[16]);

    public static void a(p94 p94Var) {
        p94Var.getClass();
        if (p94Var == b) {
            aa0.c("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (p94Var == c) {
            aa0.c("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        k37<s94> k37Var = p94Var.a;
        int i = k37Var.v;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        s94[] s94VarArr = k37Var.t;
        for (int i2 = 0; i2 < i; i2++) {
            s94 s94Var = s94VarArr[i2];
            if (!s94Var.q().G) {
                uc5.b("visitChildren called on an unattached node");
            }
            k37 k37Var2 = new k37(new ox6.c[16]);
            ox6.c cVar = s94Var.q().y;
            if (cVar == null) {
                ew2.a(k37Var2, s94Var.q());
            } else {
                k37Var2.d(cVar);
            }
            while (true) {
                int i3 = k37Var2.v;
                if (i3 == 0) {
                    break;
                }
                ox6.c cVarB = (ox6.c) k37Var2.o(i3 - 1);
                if ((cVarB.w & 1024) == 0) {
                    ew2.a(k37Var2, cVarB);
                } else {
                    while (cVarB != null) {
                        if ((cVarB.v & 1024) != 0) {
                            k37 k37Var3 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof ba4) {
                                    if (((ba4) cVarB).y(7)) {
                                        break;
                                    }
                                } else if ((cVarB.v & 1024) != 0 && (cVarB instanceof gw2)) {
                                    int i4 = 0;
                                    for (ox6.c cVar2 = ((gw2) cVarB).I; cVar2 != null; cVar2 = cVar2.y) {
                                        if ((cVar2.v & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                cVarB = cVar2;
                                            } else {
                                                if (k37Var3 == null) {
                                                    k37Var3 = new k37(new ox6.c[16]);
                                                }
                                                if (cVarB != null) {
                                                    k37Var3.d(cVarB);
                                                    cVarB = null;
                                                }
                                                k37Var3.d(cVar2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                cVarB = ew2.b(k37Var3);
                            }
                            break;
                        }
                        cVarB = cVarB.y;
                    }
                }
            }
        }
    }
}
