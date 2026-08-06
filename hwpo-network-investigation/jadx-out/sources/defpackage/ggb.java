package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.f;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ggb implements ak4<Object> {
    public volatile he2 t;
    public final Object u = new Object();
    public final ViewGroup v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        ge2 c();
    }

    public ggb(ViewGroup viewGroup) {
        this.v = viewGroup;
    }

    @Override // defpackage.ak4
    public final Object a() {
        if (this.t == null) {
            synchronized (this.u) {
                try {
                    if (this.t == null) {
                        this.t = b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.t;
    }

    public final he2 b() {
        ViewGroup viewGroup = this.v;
        Context context = viewGroup.getContext();
        while ((context instanceof ContextWrapper) && !ak4.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application applicationA = o9a.a(context.getApplicationContext());
        Object obj = context;
        if (context == applicationA) {
            dx0.b(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", viewGroup.getClass());
            obj = null;
        }
        if (obj instanceof ak4) {
            return new he2(((b) kl3.b(b.class, (ak4) obj)).c().a);
        }
        throw new IllegalStateException(viewGroup.getClass() + ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ContextWrapper {
        public LayoutInflater a;
        public LayoutInflater b;

        /* JADX INFO: renamed from: ggb$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0097a implements g76 {
            public C0097a() {
            }

            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                if (aVar == s66.a.ON_DESTROY) {
                    a aVar2 = a.this;
                    aVar2.a = null;
                    aVar2.b = null;
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(LayoutInflater layoutInflater, f fVar) {
            layoutInflater.getClass();
            Context context = layoutInflater.getContext();
            context.getClass();
            super(context);
            C0097a c0097a = new C0097a();
            this.a = layoutInflater;
            fVar.getClass();
            fVar.getLifecycle().a(c0097a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.b == null) {
                if (this.a == null) {
                    this.a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.b = this.a.cloneInContext(this);
            }
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, f fVar) {
            super(context);
            context.getClass();
            C0097a c0097a = new C0097a();
            this.a = null;
            fVar.getClass();
            fVar.getLifecycle().a(c0097a);
        }
    }
}
