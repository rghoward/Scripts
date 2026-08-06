package defpackage;

import com.hwpo_training_app.core.widget.performance_view.PerformanceView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aj4 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ aj4(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return ((bj4) obj).R();
            default:
                PerformanceView.a aVar = PerformanceView.Companion;
                zv7 zv7Var = new zv7((PerformanceView) obj);
                xv7 xv7Var = new xv7(new xv7.a());
                e93 e93Var = new e93(new sv7(0), new uv7(3), new sl0(2, zv7Var), vv7.u);
                za<List<T>> zaVar = xv7Var.d;
                zaVar.getClass();
                zaVar.b(e93Var);
                return xv7Var;
        }
    }
}
