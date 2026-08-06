package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ol8 implements Serializable {
    public final Pattern t;

    public ol8(String str, int i) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.t = patternCompile;
    }

    public final aj6 a(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.t.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new aj6(matcherRegion, str);
        }
        return null;
    }

    public final aj6 b(String str) {
        str.getClass();
        Matcher matcher = this.t.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new aj6(matcher, str);
        }
        return null;
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.t.matcher(charSequence).matches();
    }

    public final String d(String str) {
        String strReplaceAll = this.t.matcher(str).replaceAll(BuildConfig.FLAVOR);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.t.toString();
        string.getClass();
        return string;
    }

    public ol8(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.t = patternCompile;
    }
}
