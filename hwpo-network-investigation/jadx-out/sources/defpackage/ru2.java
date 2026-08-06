package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ru2 {
    public final Resources a;

    public ru2(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final String a(id4 id4Var) {
        String displayName;
        String str = id4Var.d;
        String str2 = id4Var.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = BuildConfig.FLAVOR;
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = n6b.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = BuildConfig.FLAVOR;
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strC = c(displayName, b(id4Var));
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = BuildConfig.FLAVOR;
        }
        return str2;
    }

    public final String b(id4 id4Var) {
        int i = id4Var.f;
        int i2 = i & 2;
        Resources resources = this.a;
        String string = i2 != 0 ? resources.getString(R.string.exo_track_role_alternate) : BuildConfig.FLAVOR;
        if ((i & 4) != 0) {
            string = c(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = c(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? c(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String c(String... strArr) {
        String string = BuildConfig.FLAVOR;
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : this.a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
