package defpackage;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k58 extends wp5 implements oh4<MotionEvent, Boolean> {
    public final /* synthetic */ zgb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k58(zgb zgbVar) {
        super(1);
        this.u = zgbVar;
    }

    @Override // defpackage.oh4
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        zgb zgbVar = this.u;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = zgbVar.dispatchTouchEvent(motionEvent2);
                break;
            default:
                zDispatchTouchEvent = zgbVar.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
