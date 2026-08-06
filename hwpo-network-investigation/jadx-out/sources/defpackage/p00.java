package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.intercom.twig.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class p00 {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final ep9<String, Constructor<? extends View>> h = new ep9<>();
    public final Object[] a = new Object[2];

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements View.OnClickListener {
        public final View t;
        public final String u;
        public Method v;
        public Context w;

        public a(View view, String str) {
            this.t = view;
            this.u = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.v != null) {
                break;
            }
            View view2 = this.t;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.u;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbA = aa.a("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbA.append(view2.getClass());
                    sbA.append(str);
                    throw new IllegalStateException(sbA.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.v = method;
                        this.w = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.v.invoke(this.w, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public vy a(Context context, AttributeSet attributeSet) {
        return new vy(context, attributeSet, com.hwpo_training_app.R.attr.autoCompleteTextViewStyle);
    }

    public xy b(Context context, AttributeSet attributeSet) {
        return new xy(context, attributeSet, com.hwpo_training_app.R.attr.buttonStyle);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public b00 d(Context context, AttributeSet attributeSet) {
        return new b00(context, attributeSet, com.hwpo_training_app.R.attr.radioButtonStyle);
    }

    public m00 e(Context context, AttributeSet attributeSet) {
        return new m00(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        ep9<String, Constructor<? extends View>> ep9Var = h;
        Constructor<? extends View> constructor = ep9Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            ep9Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.a);
    }
}
