class Dna(val dna: String) {

    init {
        require( dna.all { "ACGT".contains(it) } )
    }

    val nucleotideCounts = mutableMapOf('A' to dna.count { 'A' == it },
                                        'C' to dna.count { 'C' == it },
                                        'G' to dna.count { 'G' == it },
                                        'T' to dna.count { 'T' == it } )
}
