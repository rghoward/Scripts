package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wbc implements krc {
    public final /* synthetic */ mec a;

    public wbc(mec mecVar) {
        this.a = mecVar;
    }

    @Override // defpackage.krc
    public final void a(String str, String str2, Bundle bundle) {
        mec mecVar = this.a;
        mecVar.c(new aec(mecVar, str, str2, bundle));
    }

    @Override // defpackage.krc
    public final void b(Bundle bundle) {
        mec mecVar = this.a;
        mecVar.c(new occ(mecVar, bundle));
    }

    @Override // defpackage.krc
    public final void c(String str) {
        mec mecVar = this.a;
        mecVar.c(new vcc(mecVar, str));
    }

    @Override // defpackage.krc
    public final void d(String str) {
        mec mecVar = this.a;
        mecVar.c(new ucc(mecVar, str));
    }

    @Override // defpackage.krc
    public final void e(String str, String str2, Bundle bundle) {
        mec mecVar = this.a;
        mecVar.c(new pcc(mecVar, str, str2, bundle));
    }

    @Override // defpackage.krc
    public final List f(String str, String str2) {
        return this.a.f(str, str2);
    }

    @Override // defpackage.krc
    public final String g() {
        ibc ibcVar = new ibc();
        mec mecVar = this.a;
        mecVar.c(new ddc(mecVar, ibcVar));
        return (String) ibc.i(ibcVar.g(500L), String.class);
    }

    @Override // defpackage.krc
    public final int h(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.krc
    public final long i() {
        return this.a.g();
    }

    @Override // defpackage.krc
    public final String j() {
        ibc ibcVar = new ibc();
        mec mecVar = this.a;
        mecVar.c(new edc(mecVar, ibcVar));
        return (String) ibc.i(ibcVar.g(500L), String.class);
    }

    @Override // defpackage.krc
    public final Map k(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }

    @Override // defpackage.krc
    public final String l() {
        ibc ibcVar = new ibc();
        mec mecVar = this.a;
        mecVar.c(new bdc(mecVar, ibcVar));
        return (String) ibc.i(ibcVar.g(50L), String.class);
    }

    @Override // defpackage.krc
    public final String m() {
        ibc ibcVar = new ibc();
        mec mecVar = this.a;
        mecVar.c(new adc(mecVar, ibcVar));
        return (String) ibc.i(ibcVar.g(500L), String.class);
    }
}
