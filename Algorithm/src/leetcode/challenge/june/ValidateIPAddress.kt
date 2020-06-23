package leetcode.challenge.june

class ValidateIPAddress {
    fun validIPAddress(IP: String): String {

        if (IP.contains(".")) {
            val ips = IP.split(".")
            if (ips.size != 4) return "Neither"
            for (ip in ips) {
                if (ip.length > 1 && ip[0] == '0') return "Neither"
                val v = ip.toIntOrNull() ?: return "Neither"
                if (v !in 0..255) return "Neither"
            }

            return "IPv4"

        } else if (IP.contains(":")) {
            if (IP.contains("::")) return "Neither"
            val ips = IP.split(":")
            if (ips.size != 8) return "Neither"
            for (ip in ips) {
                if (ip.isEmpty()) return "Neither"
                if (ip.length > 4) return "Neither"
                for (it in ip) {
                    if (it !in 'a'..'f' && it !in 'A'..'F' && it !in '0'..'9') return "Neither"
                }

            }

            return "IPv6"
        }

        return "Neither"
    }
}