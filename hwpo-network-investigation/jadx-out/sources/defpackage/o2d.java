package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o2d {
    public final String a;
    public String b = "files";
    public String c = "common";
    public final Account d = v2d.b;
    public String e = BuildConfig.FLAVOR;
    public final k95.a f;

    public o2d(Context context) {
        k95.b bVar = k95.u;
        this.f = new k95.a();
        h4c.b(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final void a(String str) {
        h4c.b(v2d.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        h4c.b(!v2d.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.c = str;
    }

    public final void b(String str) {
        if (str.startsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
            str = str.substring(1);
        }
        Pattern pattern = v2d.a;
        this.e = str;
    }

    public final Uri c() {
        String strA;
        String str = this.b;
        String str2 = this.c;
        Account account = k2d.a;
        Account account2 = this.d;
        h4c.b(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        h4c.b(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        h4c.b(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (k2d.a.equals(account2)) {
            strA = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strA = w27.a(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = this.e;
        StringBuilder sb = new StringBuilder(strA.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        ux1.b(sb, AgentHeaderCreator.AGENT_DIVIDER, str, AgentHeaderCreator.AGENT_DIVIDER, str2);
        String strA2 = ao2.a(sb, AgentHeaderCreator.AGENT_DIVIDER, strA, AgentHeaderCreator.AGENT_DIVIDER, str5);
        ul8 ul8VarG = this.f.g();
        Pattern pattern = h3d.a;
        return new Uri.Builder().scheme("android").authority(this.a).path(strA2).encodedFragment(ul8VarG.isEmpty() ? null : "transform=".concat(new pl5("+").b(ul8VarG))).build();
    }
}
