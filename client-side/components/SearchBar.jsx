
const SearchBar = ({ setResults, setLoading, setError }) => {
  const handleSearch = (event) => {
    const keyword = event.target.value;

    if (!keyword) {
      setResults([]); 
      return;
    }

    setLoading(true);
    setError(null);

    axios.get("http://localhost:8080/api/products/search-all", { 
      params: { keyword, timestamp: Date.now() }
    })
    
      .then((response) => {
        console.log("API Response:", response.data); 
        setResults(response.data); 
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
        setError("Failed to fetch results. Please try again.");
        setLoading(false);
      });
  };

  return (
    <div className="mb-3">
      <input
        type="text"
        className="form-control form-control-lg border-primary shadow-sm"
        placeholder="Search here..."
        onChange={handleSearch}
      />
    </div>
  );
};
