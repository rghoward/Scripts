package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.hwpo_training_app.R;
import defpackage.aa0;
import defpackage.d66;
import defpackage.dh8;
import defpackage.ek7;
import defpackage.g2b;
import defpackage.g66;
import defpackage.l76;
import defpackage.mh4;
import defpackage.qh7;
import defpackage.qq2;
import defpackage.rrb;
import defpackage.s66;
import defpackage.u55;
import defpackage.x2;
import defpackage.zq9;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class YouTubePlayerView extends zq9 implements l76 {
    public final g66 t;
    public boolean u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends x2 {
        public final /* synthetic */ String a;
        public final /* synthetic */ YouTubePlayerView b;
        public final /* synthetic */ boolean c;

        public a(String str, YouTubePlayerView youTubePlayerView, boolean z) {
            this.a = str;
            this.b = youTubePlayerView;
            this.c = z;
        }

        @Override // defpackage.x2, defpackage.fsb
        public final void b(rrb rrbVar) {
            rrbVar.getClass();
            String str = this.a;
            if (str != null) {
                if (this.b.t.getCanPlay$youtube_player() && this.c) {
                    rrbVar.f(str, 0.0f);
                } else {
                    rrbVar.c(str, 0.0f);
                }
            }
            rrbVar.e(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        final g66 g66Var = new g66(context);
        this.t = g66Var;
        new LinkedHashSet();
        addView(g66Var, new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, dh8.a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.u = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        String string = typedArrayObtainStyledAttributes.getString(3);
        typedArrayObtainStyledAttributes.recycle();
        if (z && string == null) {
            aa0.c("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
            throw null;
        }
        final a aVar = new a(string, this, z);
        if (this.u) {
            final u55 u55Var = u55.b;
            u55Var.getClass();
            if (g66Var.w) {
                aa0.c("This YouTubePlayerView has already been initialized.");
                throw null;
            }
            if (z2) {
                ek7.a(g66Var, new d66(g66Var, g66Var));
            }
            mh4<g2b> mh4Var = new mh4() { // from class: z56
                @Override // defpackage.mh4
                public final Object invoke() {
                    elb elbVar = g66Var.t;
                    lz1 lz1Var = new lz1(1, aVar);
                    elbVar.getClass();
                    elbVar.t = lz1Var;
                    u55 u55Var2 = u55Var;
                    if (u55Var2 == null) {
                        u55Var2 = u55.b;
                    }
                    elbVar.getSettings().setJavaScriptEnabled(true);
                    elbVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
                    elbVar.getSettings().setCacheMode(-1);
                    elbVar.addJavascriptInterface(new dsb(elbVar), "YouTubePlayerBridge");
                    InputStream inputStreamOpenRawResource = elbVar.getResources().openRawResource(R.raw.ayp_youtube_player);
                    inputStreamOpenRawResource.getClass();
                    try {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, "utf-8"));
                            StringBuilder sb = new StringBuilder();
                            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                                sb.append(line);
                                sb.append("\n");
                            }
                            String string2 = sb.toString();
                            inputStreamOpenRawResource.close();
                            String strL = w2a.l(string2, "<<injectedPlayerVars>>", u55Var2.toString());
                            String string3 = u55Var2.a.getString("origin");
                            string3.getClass();
                            elbVar.loadDataWithBaseURL(string3, strL, "text/html", "utf-8", null);
                            elbVar.setWebChromeClient(new dlb());
                            return g2b.a;
                        } catch (Exception unused) {
                            throw new RuntimeException("Can't parse HTML file.");
                        }
                    } catch (Throwable th) {
                        inputStreamOpenRawResource.close();
                        throw th;
                    }
                }
            };
            g66Var.x = mh4Var;
            if (z2) {
                return;
            }
            mh4Var.invoke();
        }
    }

    @qh7(s66.a.ON_RESUME)
    private final void onResume() {
        this.t.onResume$youtube_player();
    }

    @qh7(s66.a.ON_STOP)
    private final void onStop() {
        this.t.onStop$youtube_player();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.u;
    }

    @qh7(s66.a.ON_DESTROY)
    public final void release() {
        this.t.release();
    }

    public final void setCustomPlayerUi(View view) {
        view.getClass();
        this.t.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.u = z;
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, int i2, qq2 qq2Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, qq2 qq2Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
