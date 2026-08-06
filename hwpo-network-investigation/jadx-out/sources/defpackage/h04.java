package defpackage;

import android.content.Context;
import androidx.fragment.app.i;
import com.google.firebase.FirebaseCommonRegistrar;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h04 implements r66.a, mb2 {
    @Override // r66.a
    public String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : BuildConfig.FLAVOR;
    }

    @Override // defpackage.mb2
    public Object c(i iVar) {
        iVar.getClass();
        return new wj7();
    }
}
