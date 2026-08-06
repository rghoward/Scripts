package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0d implements yh4 {
    public final /* synthetic */ String t;

    public /* synthetic */ c0d(String str) {
        this.t = str;
    }

    @Override // defpackage.yh4
    public final Object apply(Object obj) {
        mwc mwcVar = (mwc) obj;
        s5d s5dVar = d0d.a;
        gwc gwcVarY = gwc.y();
        String str = this.t;
        ewc ewcVar = (ewc) mwcVar.x(str, gwcVarY).p();
        if (!Collections.unmodifiableList(((gwc) ewcVar.u).x()).contains(BuildConfig.FLAVOR)) {
            ewcVar.h();
            ((gwc) ewcVar.u).z(BuildConfig.FLAVOR);
        }
        kwc kwcVar = (kwc) mwcVar.p();
        ewcVar.h();
        ((gwc) ewcVar.u).A(BuildConfig.FLAVOR);
        gwc gwcVar = (gwc) ewcVar.j();
        kwcVar.h();
        ((mwc) kwcVar.u).z().put(str, gwcVar);
        return (mwc) kwcVar.j();
    }
}
