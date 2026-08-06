package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pw {
    public static final /* synthetic */ pw[] A;
    public static final pw t;
    public static final pw u;
    public static final pw v;
    public static final pw w;
    public static final pw x;
    public static final pw y;
    public static final pw z;

    static {
        pw pwVar = new pw("Paragraph", 0);
        t = pwVar;
        pw pwVar2 = new pw("Span", 1);
        u = pwVar2;
        pw pwVar3 = new pw("VerbatimTts", 2);
        v = pwVar3;
        pw pwVar4 = new pw("Url", 3);
        w = pwVar4;
        pw pwVar5 = new pw(HttpConstants.Headers.LINK, 4);
        x = pwVar5;
        pw pwVar6 = new pw("Clickable", 5);
        y = pwVar6;
        pw pwVar7 = new pw("String", 6);
        z = pwVar7;
        A = new pw[]{pwVar, pwVar2, pwVar3, pwVar4, pwVar5, pwVar6, pwVar7};
    }

    public pw() {
        throw null;
    }

    public static pw valueOf(String str) {
        return (pw) Enum.valueOf(pw.class, str);
    }

    public static pw[] values() {
        return (pw[]) A.clone();
    }
}
