package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import androidx.fragment.app.f;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tj0 extends uy {
    public zz1 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends vg7 {
        public a() {
            super(true);
        }

        @Override // defpackage.vg7
        public final void handleOnBackPressed() {
            tj0 tj0Var = tj0.this;
            f fVarD = tj0Var.getSupportFragmentManager().D(tj0Var.u());
            hk0 hk0Var = fVarD instanceof hk0 ? (hk0) fVarD : null;
            if (hk0Var != null) {
                hk0Var.j();
            } else {
                tj0Var.finish();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    @Override // defpackage.uy, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        s10 s10Var;
        context.getClass();
        zz1 zz1VarB = ((a02) kl3.b(a02.class, context.getApplicationContext())).b();
        this.t = zz1VarB;
        if (zz1VarB == null) {
            xj5.e("localizer");
            throw null;
        }
        q5b q5bVar = zz1VarB.b;
        s10 s10VarC = q5bVar.c();
        if (s10VarC == null) {
            Locale locale = !context.getResources().getConfiguration().getLocales().isEmpty() ? context.getResources().getConfiguration().getLocales().get(0) : null;
            String language = locale != null ? locale.getLanguage() : null;
            boolean zA = xj5.a(language, "en");
            s10 s10Var2 = s10.ENGLISH;
            if (zA) {
                s10VarC = s10Var2;
            } else {
                if (xj5.a(language, "fr")) {
                    s10Var = s10.FRANCAIS;
                } else if (xj5.a(language, "es")) {
                    s10Var = s10.ESPANOL;
                } else {
                    s10VarC = s10Var2;
                }
                s10VarC = s10Var;
            }
            q5bVar.a(s10VarC);
        }
        String str = s10VarC.t;
        zz1VarB.a.b(str);
        Locale locale2 = new Locale(str);
        Locale.setDefault(locale2);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale2);
        context.createConfigurationContext(configuration);
        super.attachBaseContext(context);
    }

    @Override // defpackage.uy, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        zz1 zz1Var = this.t;
        if (zz1Var == null) {
            xj5.e("localizer");
            throw null;
        }
        Resources resources = super.getResources();
        resources.getClass();
        zz1Var.a(resources);
        return resources;
    }

    @Override // androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new OnBackInvokedCallback() { // from class: sj0
                public final void onBackInvoked() {
                    tj0 tj0Var = this.a;
                    f fVarD = tj0Var.getSupportFragmentManager().D(tj0Var.u());
                    hk0 hk0Var = fVarD instanceof hk0 ? (hk0) fVarD : null;
                    if (hk0Var != null) {
                        hk0Var.j();
                    } else {
                        tj0Var.finish();
                    }
                }
            });
        } else {
            getOnBackPressedDispatcher().b(new a());
        }
    }

    public abstract int u();
}
