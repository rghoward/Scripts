package defpackage;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up3 implements gb6.a, c.b {
    public final /* synthetic */ Object t;

    public /* synthetic */ up3(Object obj) {
        this.t = obj;
    }

    @Override // com.google.android.material.tabs.c.b
    public void a(TabLayout.g gVar, int i) {
        String string;
        hta htaVar = (hta) this.t;
        ho5<Object>[] ho5VarArr = hta.D;
        if (i != 0) {
            string = i != 1 ? BuildConfig.FLAVOR : htaVar.getString(R.string.benchmark_workouts);
        } else {
            string = htaVar.getString(R.string.personal_records);
        }
        string.getClass();
        Context contextRequireContext = htaVar.requireContext();
        contextRequireContext.getClass();
        gVar.e = new nd2(contextRequireContext, string, i);
        gVar.a();
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        ((s28.c) obj).b((tfb) this.t);
    }
}
