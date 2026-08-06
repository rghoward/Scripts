package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ok6<S> extends yy7<S> {
    public int u;
    public wk2<S> v;
    public a21 w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ai7<S> {
        public a() {
        }

        @Override // defpackage.ai7
        public final void a() {
            Iterator<ai7<S>> it = ok6.this.t.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // defpackage.ai7
        public final void b(S s) {
            Iterator<ai7<S>> it = ok6.this.t.iterator();
            while (it.hasNext()) {
                it.next().b(s);
            }
        }
    }

    @Override // androidx.fragment.app.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.u = bundle.getInt("THEME_RES_ID_KEY");
        this.v = (wk2) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.w = (a21) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.v.C(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.u)), viewGroup, this.w, new a());
    }

    @Override // androidx.fragment.app.f
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.u);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.v);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.w);
    }
}
