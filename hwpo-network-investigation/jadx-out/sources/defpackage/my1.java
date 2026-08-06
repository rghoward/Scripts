package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.hwpo_training_app.notifications.presentation.NotificationsFragment;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my1 implements ObjectConstructor, SwipeRefreshLayout.f {
    public final /* synthetic */ Object t;

    public /* synthetic */ my1(Object obj) {
        this.t = obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void a() {
        NotificationsFragment notificationsFragment = (NotificationsFragment) this.t;
        ho5<Object>[] ho5VarArr = NotificationsFragment.E;
        notificationsFragment.q().g(ec6.v, true);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newSpecialCollectionConstructor$1((Type) this.t);
    }
}
