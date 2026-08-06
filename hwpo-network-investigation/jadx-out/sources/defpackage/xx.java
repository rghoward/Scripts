package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hwpo_training_app.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xx implements jac {
    public static final /* synthetic */ xx t = new xx();

    public static final int b(int i, View view) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objG = bza.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        return i3;
    }

    public static final View c(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(b(R.id.view_tree_lifecycle_owner, view), b(R.id.view_tree_saved_state_registry_owner, view));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (d(view) == null) {
                i++;
                Object objG = bza.g(view);
                View view4 = view2;
                view2 = view;
                view = objG instanceof View ? (View) objG : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final et1 d(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (et1) weakReference.get();
        }
        return null;
    }

    public static final void e(String str) {
        str.getClass();
        throw new IllegalArgumentException(sk0.c("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final void f(TextView textView, CharSequence charSequence) {
        textView.getClass();
        CharSequence charSequence2 = charSequence;
        textView.setVisibility(charSequence2 != null ? 0 : 8);
        if (charSequence2 != null) {
            textView.setText(charSequence);
            g2b g2bVar = g2b.a;
        }
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(o6c.u.get().c());
    }
}
