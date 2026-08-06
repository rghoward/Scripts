package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {76}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
public final class w24 extends u02 {
    public int A;
    public Map t;
    public Iterator u;
    public kh9.a v;
    public Map w;
    public Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ v24 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w24(v24 v24Var, u02 u02Var) {
        super(u02Var);
        this.z = v24Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(this);
    }
}
