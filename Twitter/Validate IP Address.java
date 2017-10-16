class Solution {
    public String validIPAddress(String IP) {
                if(IP == null || IP.isEmpty()) return "Neither";
        if(IP.contains(":")){
            return (isV6(IP)?"IPv6":"Neither");
        } else {
            return (isV4(IP)?"IPv4":"Neither");
        }
    }
    
    private boolean isV6(String ip){
        int dotCount = 0;
        for(int i = 0;i<ip.length();i++) if(ip.charAt(i) == ':') dotCount++;
        if(dotCount != 7) return false;
        String gr[]= ip.split(":");
        if(gr.length != 8) return false;
        for(String g:gr){
            if(g.isEmpty()) return false;
            if(g.length()> 4){
                return false;
            }
            for(int i = 0;i<g.length();i++){
                char ch = g.charAt(i);
                if(!((ch >= '0' && ch <= '9') || (ch>='a' && ch<='f') || (ch>='A' &&ch<='F'))) return false;
            }
        }
        return true;
    }
    
    private boolean isV4(String ip){
        int dotCount = 0;
        for(int i = 0;i<ip.length();i++) if(ip.charAt(i) == '.') dotCount++;
        if(dotCount != 3) return false;
        String gr[] = ip.split("\\.");
        if(gr.length != 4) return false;
        for(String g: gr){
            if(g.isEmpty()) return false;
            for(int i = 0;i<g.length();i++){
                char ch = g.charAt(i);
                if(ch < '0' || ch > '9') return false;
            }
            try{
                int val =  Integer.parseInt(g);
                if(val > 255 ) return false;
                if(g.charAt(0) == '0' && (val != 0 || g.length() != 1) ) return false;
            }catch(NumberFormatException ex){
                return false;
            }
                
        }
        return true;
        
    }
}
