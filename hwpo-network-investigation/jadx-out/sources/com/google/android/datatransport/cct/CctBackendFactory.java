package com.google.android.datatransport.cct;

import defpackage.dxa;
import defpackage.ib2;
import defpackage.r51;
import defpackage.zh0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory implements zh0 {
    @Override // defpackage.zh0
    public dxa create(ib2 ib2Var) {
        return new r51(ib2Var.a(), ib2Var.d(), ib2Var.c());
    }
}
