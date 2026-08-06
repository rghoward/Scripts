package defpackage;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class em extends wp5 implements mh4<Boolean> {
    public final /* synthetic */ cm u;
    public final /* synthetic */ MotionEvent v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(cm cmVar, MotionEvent motionEvent) {
        super(0);
        this.u = cmVar;
        this.v = motionEvent;
    }

    @Override // defpackage.mh4
    public final Boolean invoke() {
        return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(this.v));
    }
}
